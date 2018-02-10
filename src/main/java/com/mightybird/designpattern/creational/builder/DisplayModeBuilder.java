package com.mightybird.designpattern.creational.builder;

public abstract class DisplayModeBuilder {
    protected DisplayMode displayMode = new DisplayMode();

    public abstract void buildModeName();

    public abstract void buildMenu();

    public abstract void buildPlayList();

    public abstract void buildMainBody();

    public abstract void buildControlBar();

    public DisplayMode getDisplayMode() {
        return displayMode;
    }
}
