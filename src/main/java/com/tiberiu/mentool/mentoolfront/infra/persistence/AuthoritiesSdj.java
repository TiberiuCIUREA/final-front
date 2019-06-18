package com.tiberiu.mentool.mentoolfront.infra.persistence;

import com.tiberiu.mentool.mentoolfront.domain.EmailAddress;
import com.tiberiu.mentool.mentoolfront.domain.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthoritiesSdj extends JpaRepository<Authority, EmailAddress> {
}
