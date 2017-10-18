package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public Double getField() {
        return a*b;
    }



}
