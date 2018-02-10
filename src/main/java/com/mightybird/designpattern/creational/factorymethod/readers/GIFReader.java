package com.mightybird.designpattern.creational.factorymethod.readers;

public class GIFReader implements PictureReader {
    @Override
    public void open() {
        System.out.println("GIF file opened.");
    }

    @Override
    public void close() {
        System.out.println("GIF file closed.");
    }
}
