package ru.vovchinnikov.diasoft.lessons.solid.dip;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;

public class ContractProcessor {
    private final MailSender mailSender;
    private final ContractRepository repository;

    public ContractProcessor(MailSender mailSender, ContractRepository repository) {
        this.mailSender = mailSender;
        this.repository = repository;
    }

    public void process (Contract contract){
        if (contract.isValid()) {
            repository.save(contract);
            mailSender.sendContractEmail(contract);
        }
    }
}
