package com.mightybird.designpattern.structural.composite.safe;

public class STextForm extends SafeComponent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public STextForm(String name) {

        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + " STextForm activated!");
    }
}
