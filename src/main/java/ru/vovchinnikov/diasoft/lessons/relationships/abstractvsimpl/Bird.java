package ru.vovchinnikov.diasoft.lessons.relationships.abstractvsimpl;

/**
 * @author Ovchinnikov Viktor
 */
public abstract class Bird {
    private int age;
    private String name;

    public Bird(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void fly();

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}
