package com.hotmail.jantjies.kurtney.PersonalFinanceTracker.domain;

import lombok.*;

import java.util.Objects;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class Budget {
    private String budgetId;
    private double amount;
    private String category;
    private User user;
}
