package com.mightybird.designpattern.creational.factorymethod.readers;

public class PNGReader implements PictureReader {
    @Override
    public void open() {
        System.out.println("PNG file opened.");
    }

    @Override
    public void close() {
        System.out.println("PNG file closed.");
    }
}
