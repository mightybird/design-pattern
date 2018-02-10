package com.mightybird.designpattern.creational.abstractfactory.controllers;

public class SymbianOperationController implements OperationController {
    @Override
    public void powerOn() {
        System.out.println("Symbian Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("Symbian Power Off");
    }
}
