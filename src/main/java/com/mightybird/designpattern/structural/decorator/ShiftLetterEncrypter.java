package com.mightybird.designpattern.structural.decorator;

public class ShiftLetterEncrypter extends Decorator {
    public ShiftLetterEncrypter(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        this.encrypt();
    }

    private void encrypt() {
        System.out.println("_shifted");
    }
}
