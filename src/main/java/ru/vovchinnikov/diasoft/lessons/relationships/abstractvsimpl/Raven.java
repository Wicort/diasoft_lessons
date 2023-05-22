package ru.vovchinnikov.diasoft.lessons.relationships.abstractvsimpl;

/**
 * @author Ovchinnikov Viktor
 */
public class Raven extends Bird{

    public Raven(int age, String name) {
        super(age, name);
    }

    @Override
    public void fly() {
        System.out.println("Вжух, вжух");
    }

    public static void main(String[] args) {
        Raven raven = new Raven(132, "Как-карыч");

        System.out.printf("%s: %d", raven.getName(), raven.getAge());
    }
}
