package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    void it_should_print_amount_in_statement() {
        Account account = new Account();
        account.deposit(500);
        String statement = account.printStatement();
        assertThat(statement).isEqualTo("500");
    }
}
