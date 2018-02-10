package com.mightybird.designpattern.creational.simplefactory.factory;

import com.mightybird.designpattern.creational.simplefactory.exception.UnSupportedShapeException;
import com.mightybird.designpattern.creational.simplefactory.shapes.Circle;
import com.mightybird.designpattern.creational.simplefactory.shapes.Shape;
import com.mightybird.designpattern.creational.simplefactory.shapes.Square;
import com.mightybird.designpattern.creational.simplefactory.shapes.Triangle;

public class ShapeFactory {


    public static Shape getShape(String type) throws UnSupportedShapeException {
        Shape shape;
        switch (type) {
            case "circle":
                shape = new Circle();
                return shape;
            case "square":
                shape = new Square();
                return shape;
            case "triangle":
                shape = new Triangle();
                return shape;
            default:
                throw new UnSupportedShapeException("shape type: "+ type + " 不支持的形状");
        }
    }
}
