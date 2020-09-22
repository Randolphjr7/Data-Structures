package chaining_HashTable;

public class StoredEmployee {
    public String key;
    public Employee employee;
    public boolean deleted;

    StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    StoredEmployee() {
        key = "DELETED";
        deleted = false;
    }



}
