package com.mightybird.designpattern.structural.facade;

public class FileWriter {
    public void write(String encryptedText, String fileNameDes) {
        System.out.println("Write " + encryptedText + " to file " + fileNameDes);
    }
}
