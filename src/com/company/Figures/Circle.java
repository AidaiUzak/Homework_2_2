package com.company.Figures;

public class Circle extends Figures implements Drawable {

    private double radius;
    private final double pi = 3.14;


    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "\u26AB";
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }
}
