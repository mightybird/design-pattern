package com.mightybird.designpattern.structural.decorator;

public class ReverseEncrypter extends Decorator {
    public ReverseEncrypter(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        this.encrypt();
    }

    private void encrypt() {
        System.out.println("_reversed");
    }


}
