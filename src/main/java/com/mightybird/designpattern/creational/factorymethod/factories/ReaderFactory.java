package com.mightybird.designpattern.creational.factorymethod.factories;

import com.mightybird.designpattern.creational.factorymethod.readers.PictureReader;

public abstract class ReaderFactory {

    private PictureReader reader;

    public PictureReader getReader() {
        return reader;
    }

    public void setReader(PictureReader reader) {
        this.reader = reader;
    }

    public abstract PictureReader createPictureReader();

    public void open() {
        PictureReader reader = this.getReader();
        reader.open();
    }

    public void close() {
        PictureReader reader = this.getReader();
        reader.close();
    }
}
