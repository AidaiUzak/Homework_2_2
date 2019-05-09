package com.company.Figures;

public class Square extends Figures implements Drawable {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public String draw() {
        return "\u2B1B" ;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
