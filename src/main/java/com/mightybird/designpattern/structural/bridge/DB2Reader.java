package com.mightybird.designpattern.structural.bridge;

public class DB2Reader implements ReaderImplementor {
    @Override
    public String readFromDatabase() {
        return "Read from DB2";
    }
}
