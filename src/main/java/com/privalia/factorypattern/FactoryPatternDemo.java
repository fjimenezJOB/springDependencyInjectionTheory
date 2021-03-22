package com.privalia.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory pattern = new ShapeFactory();

        // Get an object circle call its a drow method
        Shape shape1 = pattern.getShape("CIRCLE");
        // CALL DRAW METHOD OF Circle
        shape1.drow();

        // Get an object Rectangle call its a drow method
        Shape shape2 = pattern.getShape("RECTANGLE");
        // CALL DRAW METHOD OF Rectangle
        shape2.drow();

        // Get an object Square call its a drow method
        Shape shape3 = pattern.getShape("SQUARE");
        // CALL DRAW METHOD OF Square
        shape3.drow();
    }
}
