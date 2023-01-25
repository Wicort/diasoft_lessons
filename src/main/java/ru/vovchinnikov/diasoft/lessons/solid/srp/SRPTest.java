package ru.vovchinnikov.diasoft.lessons.solid.srp;

public class SRPTest {
    public static void main(String[] args) {
        Contract contract = new Contract("ЗМДКР101 № 123456",
                "Иванов Иван Иванович",
                "ivan@mail.ru", new ContractValidator());

        ContractProcessor processor = new ContractProcessor(contract);
        processor.process();
    }
}
