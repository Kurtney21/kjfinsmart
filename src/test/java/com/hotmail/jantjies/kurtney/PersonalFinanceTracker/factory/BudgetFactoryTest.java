package com.hotmail.jantjies.kurtney.PersonalFinanceTracker.factory;

import com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain.Budget;
import com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetFactoryTest {

    @Test
    void createBudget() {
        User user = User.builder()
                .userId("54W2D")
                .username("Kurtney")
                .email("kurtney.jantjies@hotmail.com")
                .password("939(ND(N9dnw")
                .build();
        Budget budget = Budget.builder()
                .budgetId("")
                .amount(255.99)
                .category("")
                .user(user)
                .build();
        assertNotNull(budget);
        System.out.println(budget);
    }
}