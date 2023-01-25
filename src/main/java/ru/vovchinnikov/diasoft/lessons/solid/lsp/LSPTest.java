package ru.vovchinnikov.diasoft.lessons.solid.lsp;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;
import ru.vovchinnikov.diasoft.lessons.solid.srp.ContractProcessor;
import ru.vovchinnikov.diasoft.lessons.solid.srp.ContractValidator;

public class LSPTest {
    public static void main(String[] args) {
        Contract contract = new Contract("ЗМДКР101 № 123456",
                "Terrorist",
                "ivan@mail.ru", new ContractValidatorWithTerroristCheck());

        ContractProcessor processor = new ContractProcessor(contract);
        processor.process();
    }
}
