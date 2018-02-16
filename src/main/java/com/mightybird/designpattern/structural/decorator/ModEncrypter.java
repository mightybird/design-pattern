package com.mightybird.designpattern.structural.decorator;

public class ModEncrypter extends Decorator {
    public ModEncrypter(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        this.encrypt();
    }

    private void encrypt() {
        System.out.println("_mod");
    }

}
