package ru.vovchinnikov.diasoft.lessons.solid.srp;

public class Contract {

    private String contractNumber;

    private String insurerName;

    private String insurerEmail;

    private ContractValidator validator;

    public Contract(String contractNumber, String insurerName, String insurerEmail, ContractValidator validator) {
        this.contractNumber = contractNumber;
        this.insurerName = insurerName;
        this.insurerEmail = insurerEmail;
        this.validator = validator;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    public String getInsurerEmail() {
        return insurerEmail;
    }

    public void setInsurerEmail(String insurerEmail) {
        this.insurerEmail = insurerEmail;
    }

    public boolean isValid(){
        return validator.isValid(this);
    }


}
