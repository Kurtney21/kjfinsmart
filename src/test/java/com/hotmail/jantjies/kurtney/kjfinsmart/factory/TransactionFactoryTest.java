package com.hotmail.jantjies.kurtney.kjfinsmart.factory;

import com.hotmail.jantjies.kurtney.kjfinsmart.domain.Transaction;
import com.hotmail.jantjies.kurtney.kjfinsmart.domain.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TransactionFactoryTest {

    @Test
    void createTransaction() {
        User user = User.builder()
                .userId("54W2D")
                .username("Kurtney")
                .email("kurtney.jantjies@hotmail.com")
                .password("939(ND(N9dnw")
                .build();
        Transaction transaction = Transaction.builder()
                .transactionId("IND9RF9")
                .amount(2561.55)
                .date(new Date())
                .category("Savings")
                .user(user)
                .build();
        assertNotNull(transaction);
        System.out.println(transaction);
    }
}