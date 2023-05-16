package com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class Goal {
    private String goalId;
    private double targetAmount;
    private double achievedAmount;
    private User user;
}
