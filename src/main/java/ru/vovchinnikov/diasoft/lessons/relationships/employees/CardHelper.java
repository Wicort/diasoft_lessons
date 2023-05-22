package ru.vovchinnikov.diasoft.lessons.relationships.employees;

/**
 * @author Ovchinnikov Viktor
 */
public class CardHelper {
    public static int id = 0;

    public static int getNextFreeId(){
        return ++id;
    }
}
