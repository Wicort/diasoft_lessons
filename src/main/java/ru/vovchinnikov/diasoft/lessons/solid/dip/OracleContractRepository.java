package ru.vovchinnikov.diasoft.lessons.solid.dip;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;
import ru.vovchinnikov.diasoft.lessons.utils.Oracleconnction;
import ru.vovchinnikov.diasoft.lessons.utils.PgSQLconntection;

public class OracleContractRepository implements ContractRepository{
    @Override
    public void save(Contract contract) {
        Oracleconnction connection = new Oracleconnction("thin:@localhost:1521:ins");
        System.out.println("Contract is saved");
        //...
    }
}
