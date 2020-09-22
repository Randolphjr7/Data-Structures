public class Employee {

    private String firstName;
    private String lastName;
    private int salary;


    Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.salary    = salary;
    }


    public String getFistName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return getFistName() + "\n" + getLastName() + "\n" + "$" + getSalary() + "\n";
    }
}
