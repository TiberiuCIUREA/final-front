package com.tiberiu.mentool.mentoolfront.infra;

import com.tiberiu.mentool.mentoolfront.domain.security.AddNewAuthority;
import com.tiberiu.mentool.mentoolfront.exposition.AuthorityCreateCommand;
import com.tiberiu.mentool.mentoolfront.domain.Role;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

@Component
@Transactional
public class InitialDataSetRunner implements ApplicationRunner {
    private final AddNewAuthority addNewAuthority;
    public InitialDataSetRunner(AddNewAuthority addNewAuthority) {
        this.addNewAuthority = addNewAuthority;
    }

    @Override
    public void run(ApplicationArguments args) {
        AuthorityCreateCommand tiberiu = new AuthorityCreateCommand("tiberiu@tiberiu.com", Role.USER, "tiberiu");
        AuthorityCreateCommand thor = new AuthorityCreateCommand("thor@thor.com", Role.MENTOR, "thor");
        AuthorityCreateCommand pogba = new AuthorityCreateCommand("pogba@pogba.com", Role.MENTOR, "pogba");
        AuthorityCreateCommand john = new AuthorityCreateCommand("john@john.com", Role.MENTOR, "john");
        AuthorityCreateCommand hercules = new AuthorityCreateCommand("hercules@power.com", Role.MENTOR, "power");
        AuthorityCreateCommand admin = new AuthorityCreateCommand("admin@admin.com", Role.ADMIN, "admin");
        Stream.of(tiberiu, thor, pogba, john, hercules, admin).forEach(addNewAuthority::addAuthorityFor);
    }
}
