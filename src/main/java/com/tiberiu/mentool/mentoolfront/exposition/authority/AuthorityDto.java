package com.tiberiu.mentool.mentoolfront.exposition.authority;

import com.tiberiu.mentool.mentoolfront.domain.Role;
import com.tiberiu.mentool.mentoolfront.domain.security.Authority;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AuthorityDto {
    @JsonProperty private String email;
    @JsonProperty private Role role;
    @JsonProperty private boolean isNotLocked;

    public AuthorityDto(Authority authority) {
        this.email = authority.getId().getValue();
        this.role = authority.getRole();
        this.isNotLocked = authority.isAccountNonLocked();
    }
}
