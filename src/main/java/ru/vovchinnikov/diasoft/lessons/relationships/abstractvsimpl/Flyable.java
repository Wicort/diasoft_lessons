package ru.vovchinnikov.diasoft.lessons.relationships.abstractvsimpl;

/**
 * @author Ovchinnikov Viktor
 */
public interface Flyable {
    private String species = new String(); // ошибка
    private int age = 10; // тоже ошибка



    public void fly();
}
