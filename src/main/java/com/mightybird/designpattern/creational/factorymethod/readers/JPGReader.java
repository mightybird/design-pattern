package com.mightybird.designpattern.creational.factorymethod.readers;

public class JPGReader implements PictureReader {
    @Override
    public void open() {
        System.out.println("JPG file opened.");
    }

    @Override
    public void close() {
        System.out.println("JPG file closed.");
    }
}
