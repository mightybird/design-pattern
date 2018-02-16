package com.mightybird.designpattern.structural.composite.safe;

public class SButton extends SafeComponent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SButton(String name) {

        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + " SButton clicked!");
    }
}
