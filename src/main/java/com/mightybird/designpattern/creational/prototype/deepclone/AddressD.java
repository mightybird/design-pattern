package com.mightybird.designpattern.creational.prototype.deepclone;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressD implements Serializable {
    private String city;
    private String street;
    private String building;

}
