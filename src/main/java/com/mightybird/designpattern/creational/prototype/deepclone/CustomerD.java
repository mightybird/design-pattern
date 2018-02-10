package com.mightybird.designpattern.creational.prototype.deepclone;

import lombok.Data;

import java.io.*;

@Data
public class CustomerD implements Serializable {
    private String name;
    private AddressD address;

    public CustomerD deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (CustomerD) objectInputStream.readObject();
    }
}
