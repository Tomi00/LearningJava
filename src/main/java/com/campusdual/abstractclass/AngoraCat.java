package com.campusdual.abstractclass;

public class AngoraCat extends Cat{
    public AngoraCat(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! (in Angora dialect)");
    }

    @Override
    public void climbing() {
        System.out.println("Sooo cute *.*");
    }
}
