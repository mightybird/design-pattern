package com.mightybird.designpattern.structural.composite.transparent;

import java.util.ArrayList;

public class TPanel extends TransparentComponent {
    private ArrayList<TransparentComponent> children = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TPanel(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Open " + name + " TPanel");
        children.forEach(TransparentComponent::operation);
    }

    @Override
    public void add(TransparentComponent transparentComponent) {
        children.add(transparentComponent);
    }

    @Override
    public void remove(TransparentComponent transparentComponent) {
        children.remove(transparentComponent);
    }

    @Override
    public TransparentComponent getChild(int i) {
        return children.get(i);
    }

}
