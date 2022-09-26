import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    //    Create a Bank Management System which has the following components:
    //    Person (which saves first, middle, and last name, age and maybe a "social security number")
    //    Bank (which saves a list of customers and their checking accounts, maximum overdraw amount)
    //    Checking Account (should have a current value, methods for taking and depositing money)
    //    Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.

    //TODO: Checking Account (should have a current value, methods for taking and depositing money)

    @Test
    public void getBalance() {
        //arrange
        CheckingAccount checkingAccount = new CheckingAccount();
        //act
        //assert
        assertEquals(0, checkingAccount.getBalance());
    }

    @Test
    public void deposit() {
        //arrange
        CheckingAccount checkingAccount = new CheckingAccount();
        //act
        checkingAccount.deposit(100);
        //assert
        assertEquals(100, checkingAccount.getBalance());
    }

    @Test
    public void withdraw() {
        //arrange
        CheckingAccount checkingAccount = new CheckingAccount();
        //act
        checkingAccount.deposit(200);
        checkingAccount.withdraw(100);
        //assert
        assertEquals(100, checkingAccount.getBalance());
    }

}