package ru.vovchinnikov.diasoft.lessons.solid.srp;

import ru.vovchinnikov.diasoft.lessons.utils.PgSQLconntection;

public class PgSQLContractRepository {

    public void save(Contract contract) {
        PgSQLconntection connection = new PgSQLconntection("localhost:5432/ins");
        System.out.printf("Contract %s is saved%n", contract.getContractNumber());

        // ...
    }
}
