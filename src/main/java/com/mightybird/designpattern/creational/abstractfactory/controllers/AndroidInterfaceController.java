package com.mightybird.designpattern.creational.abstractfactory.controllers;

public class AndroidInterfaceController implements InterfaceController {
    @Override
    public void call() {
        System.out.println("Android Interface been called");
    }
}
