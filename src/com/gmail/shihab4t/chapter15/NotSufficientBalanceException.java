package com.gmail.shihab4t.chapter15;

class NotSufficientBalanceException extends RuntimeException {
    public NotSufficientBalanceException(String message) {
        super(message);
    }
}