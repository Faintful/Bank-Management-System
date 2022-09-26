import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<Person> customers = new ArrayList<>();

    public void createCheckingAccount(int id) {
        getCustomer(id).setCheckingAccount(new CheckingAccount());
    }

    public Person getCustomer(int id) {
        return customers.get(id);
    }

    public List<Person> getCustomerList() {
        return customers;
    }

    public void newCustomer(Person person) {
        customers.add(person);
    }
}
