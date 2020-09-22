

public class IntroArrays {

    public static void main(String[] args) {

        // int array
        Integer[] intArr      = new Integer[10];

        // String array
        String[] strArr   = new String[10];

        // Object array of Employees
        Employee[] empArr = new Employee[10];

        // add elements
        intArr[0] = 6;
        intArr[1] = -5;
        intArr[2] = 33;
        intArr[3] = 0;
        intArr[4] = -1;
        intArr[5] = -1;
        intArr[6] = -22;
        intArr[7] = 100;

        empArr[0] = new Employee("Randolph", "Amaya", 100000);
        empArr[1] = new Employee("Anthony", "Amaya", 90000);
        empArr[2] = new Employee("Christian", "Gamboa", 80000);
        empArr[3] = new Employee("Anliz", "Alvarez", 85000);
        empArr[4] = new Employee("Rafa", "Arias", 80000);

        strArr[0] = "Wow";
        strArr[2] = "Stacks";
        strArr[4] = "Queues";
        strArr[6] = "Trees";
        strArr[8] = "Heaps";


        //System.out.println(Arrays.toString(empArr));

      System.out.println("\nPrint Obj Array");
        printArray(empArr);

        System.out.println("\nPrint int Array");
        printArray(intArr);

        System.out.println("\nPrint String Array");
        printArray(strArr);
    }

    /* Can you make a method that takes any type of array and prints it's contents?*/
    public static <T> void printArray(T[] list) {
        for(T element : list) {
            System.out.println(element);
        }
    }
}
