package com.mightybird.designpattern.structural.bridge;

public abstract class Converter {
    protected ReaderImplementor reader;

    public void setReader(ReaderImplementor reader) {
        this.reader = reader;
    }

    public abstract void convert();
}
