package com.company.Figures;

public class Rectungle extends Figures implements Drawable {
    private double side1;
    private double side2;

    public Rectungle(String name, double side1, double side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String draw() {
        char c = '\u2B1B';
        return String.valueOf(c) + String.valueOf(c);
    }

    @Override
    public double calculatePerimeter() {
        return (side1+side2)*2;
    }
}
