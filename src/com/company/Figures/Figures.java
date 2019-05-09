package com.company.Figures;

public abstract class Figures {
    private String name;

    public Figures (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public abstract double calculatePerimeter ();



}
