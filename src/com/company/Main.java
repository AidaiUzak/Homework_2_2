package com.company;

import com.company.Figures.*;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 23);
        Triangle triangle = new Triangle("Треугольник", 10, 15, 20);
        Square square = new Square("Квадрат", 15);
        Rectungle rectungle = new Rectungle("Прямоугольник", 20, 40);
        Circle circle1 = new Circle("Круг 1", 13);
        Triangle triangle1 = new Triangle("Треугольник 1", 20, 30, 40);

        Figures figures[] = new Figures[]{circle, triangle, square, rectungle, circle1, triangle1};
        for (Figures figure : figures) {
            System.out.println(figure.getName() + " " + ((Drawable) figure).draw() + figure.calculatePerimeter());
        }
        Dog dog = new Dog("Bobik");
        System.out.println(dog.getName() + " " + ((Drawable) dog).draw() + " " + ((SoundProducable) dog).callSound());
    }
}
