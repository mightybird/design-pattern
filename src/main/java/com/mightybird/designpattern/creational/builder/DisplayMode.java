package com.mightybird.designpattern.creational.builder;

import lombok.Data;

@Data
public class DisplayMode {
    private String modeName;
    private boolean menu;
    private boolean playList;
    private boolean mainBody;
    private boolean controlBar;
}
