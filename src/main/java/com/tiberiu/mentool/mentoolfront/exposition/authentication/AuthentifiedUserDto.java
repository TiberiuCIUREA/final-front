package com.tiberiu.mentool.mentoolfront.exposition.authentication;

import com.tiberiu.mentool.mentoolfront.domain.Role;
import com.tiberiu.mentool.mentoolfront.domain.security.Authority;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AuthentifiedUserDto {
    @JsonProperty
    private String token;
    @JsonProperty
    private String username;
    @JsonProperty
    private Role role;


    public AuthentifiedUserDto(String token) {
        this.token = token;
    }
    public AuthentifiedUserDto(Authority authority, String token) {
        this.token = token;
        this.username = authority.getUsername();
        this.role = authority.getRole();
    }
}
