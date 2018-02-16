package com.mightybird.designpattern.structural.composite.transparent;

public class TTextForm extends TransparentComponent {
    private String name;

    public TTextForm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + " TTextForm activated!");
    }

    @Override
    public void add(TransparentComponent transparentComponent) {
        System.out.println("Unsupported operation!");
    }

    @Override
    public void remove(TransparentComponent transparentComponent) {
        System.out.println("Unsupported operation!");
    }

    @Override
    public TransparentComponent getChild(int i) {
        System.out.println("Unsupported operation!");
        return null;
    }
}
