package com.mightybird.designpattern.structural.facade;

public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.print("encrypt " + plainText + " to ");
        byte[] bytes = plainText.getBytes();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            stringBuilder.append(String.valueOf(bytes[i] % 7));
        }
        String encryptedText = stringBuilder.toString();
        System.out.println(encryptedText);
        return encryptedText;
    }
}
