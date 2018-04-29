package com.mightybird.designpattern.structural.facade;

public class FileReader {
    public String read(String fileNameSrc) {
        System.out.println("Read from file " + fileNameSrc);
        return "content_of_file_" + fileNameSrc;
    }
}
