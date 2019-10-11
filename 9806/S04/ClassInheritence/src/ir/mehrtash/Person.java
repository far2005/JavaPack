package ir.mehrtash;

public class Person {

    private String firstName,lastName,natCode;

    public Person(String firstName, String lastName, String natCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.natCode = natCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNatCode() {
        return natCode;
    }

    public void setNatCode(String natCode) {
        this.natCode = natCode;
    }
}
