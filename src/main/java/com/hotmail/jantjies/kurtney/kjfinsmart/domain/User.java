package com.hotmail.jantjies.kurtney.kjfinsmart.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private String userId;
    private String username;
    private String email;
    private String password;
}
