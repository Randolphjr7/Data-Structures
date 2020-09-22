import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        // int array
        int[] intArray = {5, 19, -5, -22, 4, 36, 45, 3, 9};

        System.out.println("Before InsertionSort");
        //printArray(intArray);
        System.out.println(Arrays.toString(intArray));

        insertionSort(intArray);

        System.out.println("\n====================================");
        System.out.println("After InsertionSort");
        //printArray(intArray);
        System.out.println(Arrays.toString(intArray));
    }


    public static void insertionSort(int[] array) {

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];

            int i;
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                // shift larger numbers to the right of smaller newElement
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }


    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
