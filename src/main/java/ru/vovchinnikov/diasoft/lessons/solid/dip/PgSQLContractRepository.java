package ru.vovchinnikov.diasoft.lessons.solid.dip;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;
import ru.vovchinnikov.diasoft.lessons.utils.PgSQLconntection;

public class PgSQLContractRepository implements ContractRepository{
    @Override
    public void save(Contract contract) {
        PgSQLconntection connection = new PgSQLconntection("localhost:5432/ins");
        System.out.println("Contract is saved");
        //...
    }
}
