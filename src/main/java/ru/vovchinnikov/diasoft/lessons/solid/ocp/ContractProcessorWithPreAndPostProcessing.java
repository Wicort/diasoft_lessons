package ru.vovchinnikov.diasoft.lessons.solid.ocp;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;
import ru.vovchinnikov.diasoft.lessons.solid.srp.ContractProcessor;

public class ContractProcessorWithPreAndPostProcessing extends ContractProcessor {

    public ContractProcessorWithPreAndPostProcessing(Contract contract) {
        super(contract);
    }

    @Override
    public void process() {
        beforeProcessing();
        super.process();
        afterProcessing();
    }

    private static void beforeProcessing() {
        System.out.println("Insured info is updated");
    }

    private void afterProcessing() {
        System.out.println("Contract is uploaded to master system");
    }

}
