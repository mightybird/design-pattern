package com.mightybird.designpattern.structural.decorator;

public class Username extends Component {
    private String string;

    public Username(String string) {
        this.string = string;
    }

    @Override
    public void show() {
        System.out.println(string);
    }
}
