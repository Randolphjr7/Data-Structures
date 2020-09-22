package BucketSort;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // test array
        int[] test = {45,22,67,97,35,12,5,9,23,77};

        System.out.println("Before Bucket Sort");
        for(int num : test) {
            System.out.print(num + " ");
        }

        bucketSort(test);

        System.out.println("\n=====================================");
        System.out.println("After Bucket Sort");
        for(int num : test) {
            System.out.print(num + " ");
        }
    }

    public static void bucketSort(int[] input) {
        // a List parent iterface array of buckets
        List<Integer>[] buckets = new List[10]; // makes it easy to switch implementations of List

        // create arraylist ||  for each bucket
        for(int i = 0; i < buckets.length; i++) {

            // using ArrayList for each bucket
            //buckets[i] = new ArrayList<Integer>();

            // using LinkedList for each bucket
            //buckets[i] = new LinkedList<Integer>();

            // using vectors
            buckets[i] = new Vector<Integer>();
        }

        // hash each input value; place each value to bucket in bucket array
        for(int i = 0; i < input.length; i++) {
            // hash method
            int bucketIndex = hash(input[i]);
            buckets[bucketIndex].add(input[i]);
        }

        // now sort each bucket (each bucket has an arrayList)
        for(List bucket : buckets) {
            Collections.sort(bucket);
        }

        // List buckets is sorted; now copy over to input/test array
        int j = 0; // for iterating through original; input/test array
        for(int i = 0; i < buckets.length; i++) {
            for(int value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    // hash method --> modulo does  not work; use division
    private static int hash(int num) {
        return num / 10; // 10 is length of buckets array
    }
}
