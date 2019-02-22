package de.egga;

import java.util.ArrayList;
import java.util.List;

class Account {

    private List<Integer> transactions = new ArrayList<>();

    void deposit(Integer amount) {
        transactions.add(amount);
    }

    void withdraw(Integer amount) {
        transactions.add(amount * -1);
    }

    String printStatement() {

        int balance = 0;
        String statement = "";

        for (Integer deposit : transactions) {
            balance += deposit;
            statement += deposit + "\t" + balance + "\n";
        }

        return statement;
    }
}
