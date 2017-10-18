package com.kodilla.testing.shape;

public class Circle implements Shape {
    private  double r ;

    public Circle(double r) {
        this.r = r;
    }

    public String getShapeName() {

        return  "Circle";
    }

    public Double getField() {

        return Math.PI*r*r;
    }
}
