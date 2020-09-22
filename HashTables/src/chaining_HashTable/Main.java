package chaining_HashTable;

public class Main {


    public static void main(String[] args) {

        Employee jones    = new Employee("Jamie", "Jones", 90000);
        Employee growlers = new Employee("Steven", "Lozano", 100000);
        Employee gamboa   = new Employee("Christian", "Gamboa", 120000);
        Employee randolph = new Employee("Randolph", "Amaya", 130000);
        Employee anthony  = new Employee("Anthony", "Amaya", 125000);
        Employee hans     = new Employee("Hans", "Garcia", 75000);
        Employee rafa     = new Employee("Rafa", "Galindo", 80000);
        Employee emilio     = new Employee("Emilio", "Galindo", 80000);
        Employee nayib     = new Employee("Nayib", "Perez", 85000);

        ChainedHashTable ht = new ChainedHashTable();

        ht.put("Jamie", jones);
        ht.put("Steven", growlers);
        ht.put("Christian", gamboa);
        ht.put("Randolph", randolph);
        ht.put("Anthony", anthony);
        ht.put("Hans", hans);
        ht.put("Rafa", rafa);
        ht.put("Emilio", emilio);
        ht.put("Nayib", nayib);


        // get an employee
        System.out.println("\n========================================");
        System.out.println("Retrieve: ");
        System.out.println(ht.get("Randolph"));

        // print table
        System.out.println("\n========================================");
        ht.printTable();

        // remove an employee
        System.out.println("\n========================================");
        ht.remove("Hans");
        ht.remove("Randolph");

        // print table
        System.out.println("\n========================================");
        ht.printTable();


    } // end of main

} // end of class
