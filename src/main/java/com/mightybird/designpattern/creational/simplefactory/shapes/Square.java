package com.mightybird.designpattern.creational.simplefactory.shapes;

public class Square implements Shape {
    public Square() {
        System.out.println("创建方形");
    }

    @Override
    public void draw() {
        System.out.println("绘制方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除方形");
    }
}
