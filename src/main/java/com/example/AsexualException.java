package com.example;

public class AsexualException extends Exception {
    private String message;
    public AsexualException(String message){
        this.message = message;
    };

    @Override
    public String getMessage() {
        return message;
    }
}
