package com.example.summer_comming.exception;
import java.util.NoSuchElementException;

public class RoomNotFoundException extends NoSuchElementException {

    private String message;
    public RoomNotFoundException(String message) {
        this.message = message;
    }
}