package coding.hashtable;

public class Player {

    private String firstName;
    private String lastName;
    private int id;

    public Player(String name, String lastName, int id) {
        this.firstName = name;
        this.lastName = lastName;
        this.id = id;
    }

    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName; }
    public int getID() { return id; }

    // setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setId(int id) { this.id = id; }

    public String toString() {
        String result = "{First Name: " +this.getFirstName() + "\n" +
                          "Last Name: " + this.getLastName() + "\n" +
                          "Jersey Number: " + this.getID() + "}\n";
        return result;
    }

}
