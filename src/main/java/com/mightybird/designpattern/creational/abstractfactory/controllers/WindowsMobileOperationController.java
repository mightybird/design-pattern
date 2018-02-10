package com.mightybird.designpattern.creational.abstractfactory.controllers;

public class WindowsMobileOperationController implements OperationController {
    @Override
    public void powerOn() {
        System.out.println("Windows Mobile Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("Windows Mobile Power Off");
    }
}
