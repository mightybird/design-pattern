package com.mightybird.designpattern.creational.simplefactory.shapes;


public class Circle implements Shape {

    public Circle() {
        System.out.println("创建圆形");
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
