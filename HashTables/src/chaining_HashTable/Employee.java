package chaining_HashTable;

public class Employee {

    private String firstName;
    private String lastName;
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.salary    = salary;
    }


    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getSalary() { return salary; }

    // setters
    public void setFirstName(String newName) { firstName = newName; }
    public void setLastName(String newName) { lastName = newName; }
    public void setSalary(int newSalary) { salary = newSalary; }

    public String toString() {
        String report = "{ " + this.getFirstName() + ", " + this.getLastName()
                        + " Salary: " + this.getSalary() + " }";
        return report;
    }
}
