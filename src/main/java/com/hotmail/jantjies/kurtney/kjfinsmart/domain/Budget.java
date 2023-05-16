package com.hotmail.jantjies.kurtney.kjfinsmart.domain;

import lombok.*;

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
