package ru.vovchinnikov.diasoft.lessons.solid.dip;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;
import ru.vovchinnikov.diasoft.lessons.solid.srp.ContractValidator;

public class DIPTest {
    public static void main(String[] args) {
        Contract contract = new Contract("ЗМДКР101 № 123456",
                "Иванов Иван Иванович",
                "ivan@mail.ru", new ContractValidator());

        ContractProcessor processor = new ContractProcessor(
                new ContractEmailSender(), new OracleContractRepository()
        );
        processor.process(contract);
    }
}
