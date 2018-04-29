package com.mightybird.designpattern.structural.facade;

public class EncryptFacade {
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade() {
        fileReader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainText = fileReader.read(fileNameSrc);
        String encrypt = cipherMachine.encrypt(plainText);
        fileWriter.write(encrypt, fileNameDes);
    }
}
