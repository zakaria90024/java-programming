package com.gmail.shihab4t.chapter07.ECommerceProject;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final UUID transactionId;
    private final int value;
    private final LocalDateTime creationTime;

    public Transaction(UUID transactionId, int value) {
        this.transactionId = transactionId;
        this.value = value;
        this.creationTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", value=" + value +
                ", creationTime=" + creationTime +
                '}';
    }
}
