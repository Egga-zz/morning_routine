package de.egga;

import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void asd() {
        Account account = new Account();
        account.deposit(100);
        String statement = account.printStatement();

    }
}
