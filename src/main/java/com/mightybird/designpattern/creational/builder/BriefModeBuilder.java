package com.mightybird.designpattern.creational.builder;

public class BriefModeBuilder extends DisplayModeBuilder {
    @Override
    public void buildModeName() {
        displayMode.setModeName("Brief");
    }

    @Override
    public void buildMenu() {
        displayMode.setMenu(false);
    }

    @Override
    public void buildPlayList() {
        displayMode.setPlayList(false);
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
