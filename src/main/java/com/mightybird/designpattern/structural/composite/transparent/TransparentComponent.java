package com.mightybird.designpattern.structural.composite.transparent;

public abstract class TransparentComponent {
    public abstract void operation();

    public abstract void add(TransparentComponent transparentComponent);

    public abstract void remove(TransparentComponent transparentComponent);

    public abstract TransparentComponent getChild(int i);
}
