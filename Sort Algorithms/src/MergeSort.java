import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before MergeSort");
        System.out.printf(Arrays.toString(intArray));

        // Sort
        mergeSort(intArray, 0, intArray.length);

        System.out.println("\n==================================");
        System.out.println("After MergeSort");
        System.out.println(Arrays.toString(intArray));
    }

    // {20, 35, -15, 7, 55, 1, -22}
    public static void mergeSort(int[] input, int start, int end) {
        // base case; break out of this method
        if(end - start < 2) {
            return; // breaks recursion
        }

        int midPoint = (start + end) / 2;

        mergeSort(input, start, midPoint);
        mergeSort(input, midPoint, end);

        // merge
        merge(input, start, midPoint, end);

    }

    // {20, 35, -15, 7, 55, 1, -22}
    public static void merge(int[] inputArray, int start, int mid, int end) {
        // check if elements in left array are already smaller than elements in right array
        if(inputArray[mid - 1] <= inputArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];
        while(i < mid && j < end) {
            // two-fingers iteration; add smaller element to temp array; increment that finger
            tempArray[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }

        // handle the remaining elements of the left partition that haven't been traversed by the two-finger iteration
        // You don't have to do this for the right partition if there are elements that have not been checked
        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, inputArray, start, tempIndex);

    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
