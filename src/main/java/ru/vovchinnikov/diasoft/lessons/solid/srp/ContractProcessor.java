package ru.vovchinnikov.diasoft.lessons.solid.srp;

import ru.vovchinnikov.diasoft.lessons.utils.PgSQLconntection;

public class ContractProcessor {

    private final Contract contract;

    private  PgSQLContractRepository repository = new PgSQLContractRepository();
    private ContractEmailSender sender = new ContractEmailSender();

    public ContractProcessor(Contract contract) {
        this.contract = contract;
    }

    public void process () {
        if (contract.isValid()){
            /*save();
            sendPolicyToInsured();*/

            repository.save(contract);
            sender.sendPolicyToInsured(contract);
        }
    }
/*
    public void save() {
        PgSQLconntection connection = new PgSQLconntection("localhost:5432/ins");
        System.out.printf("Contract %s is saved%n", contract.getContractNumber());

        // ...
    }

    public void sendPolicyToInsured() {
        System.out.printf("Contract %s id sended to %s%n",
                contract.getContractNumber(),
                contract.getInsurerName());
        // ...
    }

 */
}
