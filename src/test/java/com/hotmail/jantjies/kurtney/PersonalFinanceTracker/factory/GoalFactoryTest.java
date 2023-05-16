package com.hotmail.jantjies.kurtney.PersonalFinanceTracker.factory;

import com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain.User;
import com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain.Goal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalFactoryTest {

    @Test
    void createGoal() {
        User user = User.builder()
                .userId("54W2D")
                .username("Kurtney")
                .email("kurtney.jantjies@hotmail.com")
                .password("939(ND(N9dnw")
                .build();
        Goal goal = Goal.builder()
                .goalId("EW22E3")
                .targetAmount(555.36)
                .achievedAmount(626.55)
                .user(user)
                .build();
        assertNotNull(goal);
        System.out.println(goal);
    }
}