package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    void it_should_print_amount_in_statement() {
        Account account = new Account();
        account.deposit(500);
        String statement = account.printStatement();
        assertThat(statement).contains("500");
    }

    @Test
    void it_should_print_all_amounts_in_statement() {
        Account account = new Account();
        account.deposit(200);
        account.deposit(300);
        String statement = account.printStatement();
        assertThat(statement).contains("200", "300");
    }

    @Test
    void it_should_print_balance_in_statement() {
        Account account = new Account();
        account.deposit(200);
        account.deposit(300);
        String statement = account.printStatement();
        assertThat(statement).contains("500");
    }
}
