package de.egga;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class AccountTest {

    @Mock
    DateProvider dateProvider;

    @InjectMocks
    Account account;

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

    @Test
    void withdrawed_amount_should_occur_on_statement() {

        account.withdraw(100);

        assertThat(account.printStatement()).contains("100");
    }

    @Test
    void transaction_date_should_occur_on_statement() {

        doReturn("22.02.2019").when(dateProvider).getCurrentDateAsString();

        account.deposit(100);

        assertThat(account.printStatement()).contains("22.02.2019");
    }
}
