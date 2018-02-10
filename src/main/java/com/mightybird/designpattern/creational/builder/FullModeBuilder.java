package com.mightybird.designpattern.creational.builder;

public class FullModeBuilder extends DisplayModeBuilder {
    @Override
    public void buildModeName() {
        displayMode.setModeName("Full");
    }

    @Override
    public void buildMenu() {
        displayMode.setMenu(true);
    }

    @Override
    public void buildPlayList() {
        displayMode.setPlayList(true);
    }

    @Override
    public void buildMainBody() {
        displayMode.setMainBody(true);
    }

    @Override
    public void buildControlBar() {
        displayMode.setControlBar(true);
    }
}
