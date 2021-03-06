package com.valandro.impl.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthModel {
    private String token;
    private Integer clientId;
    private Integer accessLevel;
    private String name;
    private Integer blocked;
}
