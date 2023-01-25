package ru.vovchinnikov.diasoft.lessons.solid.lsp;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;
import ru.vovchinnikov.diasoft.lessons.solid.srp.ContractValidator;

public class ContractValidatorWithTerroristCheck extends ContractValidator {
    @Override
    public boolean isValid(Contract contract) {
        if (contract.getInsurerName().equals("Terrorist")){
            throw new TerroristException();
        }
        return super.isValid(contract);
    }
}
