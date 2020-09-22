package HashMap;

import chaining_HashTable.Employee;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee jones    = new Employee("Jamie", "Jones", 90000);
        Employee growlers = new Employee("Steven", "Lozano", 100000);
        Employee gamboa   = new Employee("Christian", "Gamboa", 120000);
        Employee randolph = new Employee("Randolph", "Amaya", 130000);
        Employee anthony  = new Employee("Anthony", "Amaya", 125000);
        Employee hans     = new Employee("Hans", "Garcia", 75000);
        Employee rafa     = new Employee("Rafa", "Galindo", 80000);
        Employee emilio   = new Employee("Emilio", "Galindo", 80000);
        Employee nayib    = new Employee("Nayib", "Perez", 85000);


        Map<String, Employee> hashMap = new HashMap<String, Employee>();

        // add employees to hashMap
        hashMap.put("Jamie", jones);
        hashMap.put("Steven", growlers);
        hashMap.put("Christian", gamboa);
        hashMap.put("Randolph", randolph);
        hashMap.put("Anthony", anthony);
        hashMap.put("Hans", hans);
        hashMap.put("Rafa", rafa);
        hashMap.put("Emilio", emilio);
        hashMap.put("Nayib", nayib);

        // Print hashMap with Iterator
/*        System.out.println("=========================================");
        Iterator<Employee> iterator = hashMap.values().iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        // For each Available Java8+
        System.out.println("=========================================");
        hashMap.forEach((key, value) -> System.out.println("KEY: " + key + "\n" + "Value: " + value + "\n"));

        // built in methods
        System.out.println("=========================================");
        System.out.println(hashMap.containsKey("Randolph"));
        System.out.println(hashMap.containsValue(gamboa));
    }
}
