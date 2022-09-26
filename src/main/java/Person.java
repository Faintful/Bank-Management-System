public class Person {

    private CheckingAccount checkingAccount;

    private final String name;
    private final String middleName;
    private final String surname;
    private final int age;
    private final String SSN;

    public Person(String name, String middleName, String surname, int age, String SSN) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.age = age;
        this.SSN = SSN;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }
}
