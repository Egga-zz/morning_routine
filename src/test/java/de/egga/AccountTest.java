package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    void asd() {
        Account account = new Account();
        account.deposit(100);
        String statement = account.printStatement();
        assertThat(statement).contains("100");
    }
}
