package com.hotmail.jantjies.kurtney.PersonalFinanceTracker.factory;

import com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain.Goal;
import com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain.User;

public class GoalFactory {
    public static Goal createGoal(String goalId, double targetAmount, double achievedAmount, User user){
        //Needs Validation

        //Return new instance of Goal class
        return Goal.builder()
                .goalId(goalId)
                .targetAmount(targetAmount)
                .achievedAmount(achievedAmount)
                .user(user)
                .build();
    }
}
