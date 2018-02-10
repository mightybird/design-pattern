package com.mightybird.designpattern.creational.builder;

public class LegacyModeBuilder extends DisplayModeBuilder {
    @Override
    public void buildModeName() {
        displayMode.setModeName("Legacy");
    }

    @Override
    public void buildMenu() {
        displayMode.setMenu(false);
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
