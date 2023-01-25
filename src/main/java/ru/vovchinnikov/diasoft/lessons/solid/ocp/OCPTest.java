package ru.vovchinnikov.diasoft.lessons.solid.ocp;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;
import ru.vovchinnikov.diasoft.lessons.solid.srp.ContractValidator;

public class OCPTest {
    public static void main(String[] args) {
        Contract contract = new Contract("ЗМДКР101 № 123456",
                "Иванов Иван Иванович",
                "ivan@mail.ru",  new ContractValidator());

        ContractProcessorWithPreAndPostProcessing processor = new ContractProcessorWithPreAndPostProcessing(contract);
        processor.process();
    }
}

