import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.contentOf;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.CoreMatchers.containsString;

//import org.junit.Test;
//import org.junit.Ignore;


public class BankAccountTest {
    String name = "Salma";
    String surname = "Mounes";
    String DOB = "05/10/2000";
    int account_number = 333;
    double balance = 0;
    int deposit = 50;

    @Test
    public void testName() {
        String testName = "salma";
        assertThat(testName).contains("salma");

    }

    @Test
    public void testSurname() {
        String testSurname = "mounes";
        assertThat(testSurname).contains("mounes");

    }

    @Test
    public void testDOB() {
        String testDOB = "05/10/2000";
        assertThat(testDOB).contains("05/10/2000");

    }

    @Test
    public void testAccount_number() {
        int actual = 333;
        int expected = 333;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void testBalance() {
        int actual = 0;
        int expected = 0;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void testDeposit() {
        int actual = 0;
        int expected = 0;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void withdraw() {
        int actual = 0;
        int expected = 0;
        assertThat(actual).isEqualTo(expected);


    }
}
