package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    Account account = new Account();

    @Test
    void it_should_print_amount_in_statement() {
        account.deposit(500);

        assertThat(account.printStatement()).contains("500");
    }

    @Test
    void it_should_print_all_amounts_in_statement() {
        account.deposit(200);
        account.deposit(300);

        assertThat(account.printStatement()).contains("200", "300");
    }

    @Test
    void it_should_print_balance_in_statement() {
        account.deposit(200);
        account.deposit(300);

        assertThat(account.printStatement()).contains("500");
    }
}
