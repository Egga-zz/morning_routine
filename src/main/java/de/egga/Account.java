package de.egga;

public class Account {

    private Integer amount;


    public void deposit(Integer amount) {

        this.amount = amount;
    }

    public String printStatement() {

        return amount.toString();
    }
}
