package com.mightybird.designpattern.creational.simplefactory.exception;

public class UnSupportedShapeException extends Exception {
    public UnSupportedShapeException() {
    }

    public UnSupportedShapeException(String message) {
        super(message);
    }
}
