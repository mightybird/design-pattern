package com.mightybird.designpattern.structural.decorator;

public class Password extends Component {
    private String string;

    public Password(String string) {
        this.string = string;
    }

    @Override
    public void show() {
        System.out.println(string);
    }
}
