package ru.vovchinnikov.diasoft.lessons.solid.dip;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;

public class ContractEmailSender implements MailSender{
    @Override
    public void sendContractEmail(Contract contract) {
        System.out.printf("email for %s sended to %s%n",
                contract.getInsurerName(),
                contract.getInsurerEmail());
    }
}
