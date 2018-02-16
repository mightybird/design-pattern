package com.mightybird.designpattern.structural.composite.transparent;

public class TButton extends TransparentComponent {

    private String name;

    public TButton(String name) {
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
        System.out.println(name + " TButton clicked!");
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
