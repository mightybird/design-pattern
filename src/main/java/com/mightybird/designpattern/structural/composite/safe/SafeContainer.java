package com.mightybird.designpattern.structural.composite.safe;

public abstract class SafeContainer extends SafeComponent {
    public abstract void add(SafeComponent safeComponent);

    public abstract void remove(SafeComponent safeComponent);

    public abstract SafeComponent getChild(int i);
}
