package com.example.pageclone.exception;

public class NotEnoughStockException extends RuntimeException {
    public NotEnoughStockException() {

    }

    public NotEnoughStockException(String message) {
        super(message);
    }

}
