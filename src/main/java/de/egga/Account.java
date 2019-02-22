package de.egga;

import java.util.ArrayList;
import java.util.List;

class Account {

    private List<Integer> deposits = new ArrayList<>();

    void deposit(Integer amount) {
        deposits.add(amount);
    }

    String printStatement() {

        int balance = 0;
        String statement = "";

        for (Integer deposit : deposits) {
            balance += deposit;
            statement += deposit + "\t" + balance + "\n";
        }

        return statement;
    }

    public void withdraw(int i) {
        deposits.add(i*-1);
    }
}
