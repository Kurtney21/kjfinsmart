package com.hotmail.jantjies.kurtney.PersonalFinanceTracker.factory;

import com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain.User;

public class UserFactory {
    public static User createUser(String userId, String username, String email, String password){
        //Validation Required

        //Returns a new User instance
        return User.builder()
                .userId(userId)
                .username(username)
                .email(email)
                .password(password)
                .build();
    }
}
