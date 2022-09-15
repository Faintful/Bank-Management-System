public class Person {

    public Person(String name, String middleName, String lastName, int age, String SSN) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.SSN = SSN;
    }

    private final String name;
    private final String middleName;
    private final String lastName;
    private final int age;
    private final String SSN;

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }


    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public String getSSN() {
        return SSN;
    }

}
