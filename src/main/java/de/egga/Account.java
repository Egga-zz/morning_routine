package de.egga;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private List<Integer> amounts = new ArrayList<>();


    public void deposit(Integer amount) {
        this.amounts.add(amount);
    }

    public String printStatement() {

        String statement = "";
        int balance = 0;
        for (Integer amount : amounts) {
            balance += amount;
            statement += amount + "\t" + balance + "\n";
        }

        return statement;
    }
}
