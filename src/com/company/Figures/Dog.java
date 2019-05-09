package com.company.Figures;

public class Dog extends Animal implements Drawable,SoundProducable {

    String name;

    public Dog (String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String draw() {
        return "\\ud83d\\udc29";
    }

    @Override
    public String callSound() {
        return "Тяв-тяв";
    }
}
