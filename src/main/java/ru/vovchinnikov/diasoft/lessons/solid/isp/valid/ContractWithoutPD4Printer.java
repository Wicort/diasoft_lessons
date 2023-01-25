package ru.vovchinnikov.diasoft.lessons.solid.isp.valid;

public class ContractWithoutPD4Printer implements ContractWithPrintableRules, ContractWithPrintablePolicy{
    @Override
    public void printRules() {
        System.out.println("rules is printed");
    }

    @Override
    public void printPolicy() {
        System.out.println("policy is printed");
    }

}
