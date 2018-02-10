package com.mightybird.designpattern.creational.factorymethod.factories;

import com.mightybird.designpattern.creational.factorymethod.readers.GIFReader;
import com.mightybird.designpattern.creational.factorymethod.readers.PictureReader;

public class GIFReaderFactory extends ReaderFactory {
    @Override
    public PictureReader createPictureReader() {
        this.setReader(new GIFReader());
        return this.getReader();
    }
}
