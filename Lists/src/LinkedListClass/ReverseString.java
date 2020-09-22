package LinkedListClass;

public class ReverseString {

    public static void main(String[] args) {

        int[] test = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("BEFORE:\n");
        for(int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println("\nLength: " + test.length);

        reverseArray(test);

        System.out.println("\n");
        System.out.println("AFTER:\n");
        for(int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }

    public static void reverseArray(int[] array) {
        // edge case
        if (array.length <= 1) {
            return;
        }
        // initialize to begin from the end of the array
        int end = array.length - 1;
        for (int i = 0; i < array.length; i++) {

            // check if we reached the end
            if(i == array.length / 2) {
                return;
            }
            // swap
            int temp   = array[i];
            array[i]   = array[end];
            array[end] = temp;

            // decrement end variable
            end--;
        }
    }



}
