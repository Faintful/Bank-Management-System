public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        Person johnDoe = new Person("John", "Michael", "Doe", 40, "237-69-8242");

        bank.newCustomer(johnDoe);
        bank.createCheckingAccount(bank.getCustomerList().indexOf(johnDoe));
        bank.getCustomer(bank.getCustomerList().indexOf(johnDoe)).getCheckingAccount().deposit(100);

        System.out.println("John Doe's current balance is: " + bank.getCustomer(bank.getCustomerList().indexOf(johnDoe)).getCheckingAccount().getBalance());
    }

}
