package com.hotmail.jantjies.kurtney.kjfinsmart.factory;

import com.hotmail.jantjies.kurtney.kjfinsmart.domain.Budget;
import com.hotmail.jantjies.kurtney.kjfinsmart.domain.User;

public class BudgetFactory {
    public static Budget createBudget(String id, double amount, String category, User user){
        //Needs validation


        //return a new instance of the Budget class
        return Budget.builder()
                .budgetId(id)
                .amount(amount)
                .category(category)
                .user(user)
                .build();
    }
}
