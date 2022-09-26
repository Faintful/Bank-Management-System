import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    //    Create a Bank Management System which has the following components:
    //    Person (which saves first, middle, and last name, age and maybe a "social security number")
    //    Bank (which saves a list of customers and their checking accounts, maximum overdraw amount)
    //    Checking Account (should have a current value, methods for taking and depositing money)
    //    Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.

    //TODO: Bank class must contain a method to create checking accounts by passing a person
    //TODO: Creating the checking account requires an initial deposit
    //TODO: Bank class must contain a list of Person objects

    @Test
    public void createCheckingAccount() {
        //arrange
        Person johnDoe = new Person("John", "Michael", "Doe", 40, "237-69-8242");
        Bank bank = new Bank();
        //act
        bank.newCustomer(johnDoe);
        bank.createCheckingAccount(bank.getCustomerList().indexOf(johnDoe));
        bank.getCustomer(bank.getCustomerList().indexOf(johnDoe)).getCheckingAccount().deposit(100);
        //assert
        assertEquals(100, bank.getCustomer(0).getCheckingAccount().getBalance());
    }
}