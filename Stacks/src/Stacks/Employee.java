package Stacks;

public class Employee {

    private String firstName;
    private String lastName;
    private int iD;


    public Employee(String firstName, String LastName, int iD){
        this.firstName = firstName;
        this.lastName  = LastName;
        this.iD        = iD;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public String getLastName(String name) {
        return name;
    }

    public void setiD(int newId) {
        iD = newId;
    }

    public int getiD() {
        return iD;
    }

    public String toString() {
        return "{" + firstName +  ", " + lastName + " , ID: " + iD + "}";
    }
}
