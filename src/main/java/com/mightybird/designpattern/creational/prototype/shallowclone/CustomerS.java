package com.mightybird.designpattern.creational.prototype.shallowclone;

import lombok.Data;

@Data
public class CustomerS implements Cloneable {
    private String name;
    private AddressS address;

    public CustomerS shallowClone() {
        Object object = null;
        try {
            object = super.clone();
            return (CustomerS) object;
        } catch (CloneNotSupportedException e) {
            System.out.println("Unsupported clone!");
            e.printStackTrace();
            return null;
        }
    }
}
