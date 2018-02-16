package com.mightybird.designpattern.structural.bridge;

public class TXTConverter extends Converter {
    @Override
    public void convert() {
        System.out.println("Data " + reader.readFromDatabase() + " and converted to txt file");
    }
}
