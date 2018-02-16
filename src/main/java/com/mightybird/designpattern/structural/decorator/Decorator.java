package com.mightybird.designpattern.structural.decorator;

public class Decorator extends Component {
    public Decorator(Component component) {
        this.component = component;
    }

    protected Component component;

    @Override
    public void show() {
        component.show();
    }
}
