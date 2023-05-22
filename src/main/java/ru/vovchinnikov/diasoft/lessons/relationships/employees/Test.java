package ru.vovchinnikov.diasoft.lessons.relationships.employees;

/**
 * @author Ovchinnikov Viktor
 */
public class Test {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.card = new Card(CardHelper.getNextFreeId());

    }
}
