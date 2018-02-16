package com.mightybird.designpattern.structural.bridge;

public class MySQLReader implements ReaderImplementor {
    @Override
    public String readFromDatabase() {
        return "Read from MySQL";
    }
}
