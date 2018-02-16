package com.mightybird.designpattern.structural.bridge;

public class MongoDBReader implements ReaderImplementor {
    @Override
    public String readFromDatabase() {
        return "Read from MongoDB";
    }
}
