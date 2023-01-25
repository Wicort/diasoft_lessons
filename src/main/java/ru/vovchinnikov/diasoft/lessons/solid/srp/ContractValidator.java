package ru.vovchinnikov.diasoft.lessons.solid.srp;

public class ContractValidator {
    public boolean isValid(Contract contract) {
        if (contract.getContractNumber().isEmpty()) {
            System.out.printf("Contract %s is not valid%n", contract.getContractNumber());
            return false;
        }
        System.out.printf("Contract %s is valid%n", contract.getContractNumber());
        return true;
    }
}
