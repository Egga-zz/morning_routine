package de.egga;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
class Account {

    private final List<Integer> transactions = new ArrayList<>();

    private final DateProvider dateProvider;

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
            statement += dateProvider.getCurrentDateAsString() + "\t" + deposit + "\t" + balance + "\n";
        }

        return statement;
    }
}
