package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    Account account = new Account();

    @Test
    void deposited_amount_should_occur_on_statement() {

        account.deposit(100);

        assertThat(account.printStatement()).contains("100");
    }
    @Test
    void balance_should_occur_on_statement() {

        account.deposit(100);
        account.deposit(100);

        assertThat(account.printStatement()).contains("200");
    }
}
