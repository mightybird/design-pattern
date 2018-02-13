package com.mightybird.designpattern.structural.adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public String encryptUserPass(String str) {
        return adaptee.encrypt(str);
    }
}
