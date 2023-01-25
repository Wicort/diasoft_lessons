package ru.vovchinnikov.diasoft.lessons.solid.isp;

public class ContractWithoutPD4Printer implements PrintableContract{
    @Override
    public void printRules() {
        System.out.println("ContractWithoutPD4 rules is printed");
    }

    @Override
    public void printPolicy() {
        System.out.println("ContractWithoutPD4 policy is printed");
    }

    @Override
    public void printPD4() {
        throw new UnsupportedOperationException();
    }
}
