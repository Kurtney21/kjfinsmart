package com.hotmail.jantjies.kurtney.kjfinsmart.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class Transaction {
    private String transactionId;
    private double amount;
    private Date date;
    private String category;
    private User user;
}
