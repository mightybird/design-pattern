package com.mightybird.designpattern.creational.builder;

public class DisplayModeDirector {
    public DisplayMode construct(DisplayModeBuilder displayModeBuilder) {
        displayModeBuilder.buildModeName();
        displayModeBuilder.buildMenu();
        displayModeBuilder.buildPlayList();
        displayModeBuilder.buildMainBody();
        displayModeBuilder.buildControlBar();
        DisplayMode displayMode = displayModeBuilder.getDisplayMode();
        return displayMode;
    }
}
