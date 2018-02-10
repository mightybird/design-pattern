package com.mightybird.designpattern.creational.factorymethod.factories;

import com.mightybird.designpattern.creational.factorymethod.readers.JPGReader;
import com.mightybird.designpattern.creational.factorymethod.readers.PictureReader;

public class JPGReaderFactory extends ReaderFactory {
    @Override
    public PictureReader createPictureReader() {
        this.setReader(new JPGReader());
        return this.getReader();
    }
}
