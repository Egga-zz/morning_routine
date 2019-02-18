package de.egga;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Account {

    private List<Integer> amounts = new ArrayList<>();


    public void deposit(Integer amount) {

        this.amounts.add(amount);
    }

    public String printStatement() {

        return amounts.stream()
                .map(n -> n.toString())
                .collect(joining("\n"));
    }
}
