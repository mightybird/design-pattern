package com.mightybird.designpattern.structural.composite.safe;

import java.util.ArrayList;

public class SWindow extends SafeContainer {
    private ArrayList<SafeComponent> children = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SWindow(String name) {

        this.name = name;
    }

    @Override
    public void add(SafeComponent safeComponent) {
        children.add(safeComponent);
    }

    @Override
    public void remove(SafeComponent safeComponent) {
        children.remove(safeComponent);
    }

    @Override
    public SafeComponent getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        System.out.println("Open " + name + " SWindow");
        children.forEach(SafeComponent::operation);
    }
}
