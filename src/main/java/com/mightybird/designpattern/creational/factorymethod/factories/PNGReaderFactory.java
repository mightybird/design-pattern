package com.mightybird.designpattern.creational.factorymethod.factories;

import com.mightybird.designpattern.creational.factorymethod.readers.PNGReader;
import com.mightybird.designpattern.creational.factorymethod.readers.PictureReader;

public class PNGReaderFactory extends ReaderFactory {
    @Override
    public PictureReader createPictureReader() {
        this.setReader(new PNGReader());
        return this.getReader();
    }
}
