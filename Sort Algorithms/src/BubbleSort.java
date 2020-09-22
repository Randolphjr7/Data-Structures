import java.util.Arrays;

public class BubbleSort {

    // YouTube Link
    // https://www.youtube.com/watch?v=xli_FI7CuzA&ab_channel=MichaelSambol

    public static void main(String[] args) {

        int[] intArray = {22,1,44,-6,17,22,30,3,7};

        System.out.println("Before Bubble Sort");
        System.out.println(Arrays.toString(intArray));
        System.out.println("==============================\n");

        bubbleSort(intArray);

        System.out.println("==============================\n");
        System.out.println("After Bubble Sort");
        System.out.println(Arrays.toString(intArray));

    }

    // there many implementations; this is one of them
    public static void bubbleSort(int[] array) {

        // start from the end
        for(int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0 ;lastUnsortedIndex--) {

            for(int i = 0; i < lastUnsortedIndex; i++) {

                System.out.println(Arrays.toString(array));
                if(array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        // no need to swap
        if (i == j) {
            return;
        }
        // swap
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
