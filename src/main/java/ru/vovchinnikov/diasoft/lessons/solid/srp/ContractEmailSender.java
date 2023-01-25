package ru.vovchinnikov.diasoft.lessons.solid.srp;

public class ContractEmailSender {

    public void sendPolicyToInsured(Contract contract) {
        System.out.printf("Contract %s id sended to %s%n",
                contract.getContractNumber(),
                contract.getInsurerName());
        // ...
    }
}
