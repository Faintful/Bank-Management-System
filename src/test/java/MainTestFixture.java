import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

//    Create a Bank Management System which has the following components:
//    Person (which saves first, middle     and last name, age and maybe a "social security number")
//    Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
//    Checking Account (should have a current value, methods for taking and depositing money)
//    Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.

    //TODO: Person class. Must have the fields: first name, middle name, last name, age, and social security number

    @Test
    public void personGetters() {
        //arrange
        Person person = new Person("John", "Michael", "Doe", 40, "253-45-2016");
        //act
        //assert
        assertEquals("John", person.getName());
        assertEquals("Michael", person.getMiddleName());
        assertEquals("Doe", person.getLastName());
        assertEquals(40, person.getAge());
        assertEquals("253-45-2016", person.getSSN());
    }

    //TODO: Bank class. Contains list of Customer objects. Can open new Checking Accounts.
    //TODO: Customers is another class that has Checking Account object fields.
    //TODO: Checking Account class. Must have current value, a maximum overdraw value, and withdraw and deposit methods. Requires an initial deposit to create.

}
