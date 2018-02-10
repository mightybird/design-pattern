package com.mightybird.designpattern.creational.abstractfactory.controllers;

public class WindowsMobileInterfaceController implements InterfaceController{
    @Override
    public void call() {
        System.out.println("Windows Mobile Interface been called");
    }
}
