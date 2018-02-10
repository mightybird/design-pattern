package com.mightybird.designpattern.creational.abstractfactory.controllers;

public class AndroidOperationController implements OperationController {

    @Override
    public void powerOn() {
        System.out.println("Android Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("Android Power Off");
    }
}
