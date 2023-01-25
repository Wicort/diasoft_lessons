package ru.vovchinnikov.diasoft.lessons.solid.isp;

public class ContractPrinter implements PrintableContract{
    @Override
    public void printRules() {
        System.out.println("rules is printed");
    }

    @Override
    public void printPolicy() {
        System.out.println("policy is printed");
    }

    @Override
    public void printPD4() {
        System.out.println("PD4 is printed");
    }
}
