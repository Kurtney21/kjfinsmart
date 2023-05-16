package com.hotmail.jantjies.kurtney.PersonalFinanceTracker.factory;

import com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    void createUser() {
        User user = User.builder()
                .userId("56D6SR")
                .username("Matteo")
                .email("matteo.jantjies@hotmail.com")
                .password("e9ds0Sd!")
                .build();
        assertNotNull(user);
        System.out.println(user);
    }
}