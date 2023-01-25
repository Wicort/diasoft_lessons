package ru.vovchinnikov.diasoft.lessons.solid.dip;

import ru.vovchinnikov.diasoft.lessons.solid.srp.Contract;

public interface ContractRepository {
    void save(Contract contract);
}
