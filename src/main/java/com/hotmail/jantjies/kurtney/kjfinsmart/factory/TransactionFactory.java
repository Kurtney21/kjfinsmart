package com.hotmail.jantjies.kurtney.kjfinsmart.factory;

import com.hotmail.jantjies.kurtney.kjfinsmart.domain.Transaction;
import com.hotmail.jantjies.kurtney.kjfinsmart.domain.User;

import java.util.Date;

public class TransactionFactory {
    public static Transaction createTransaction(String transactionId, double amount, Date date, String category, User user){
        //Validation Needed Regex

        //Returns a new Transaction instance
        return Transaction.builder()
                .transactionId(transactionId)
                .amount(amount)
                .date(date)
                .category(category)
                .user(user)
                .build();
    }
}
