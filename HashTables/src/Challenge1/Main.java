package Challenge1;

public class Main {

    /* This Challenge focuses on the hashing implementation */
    public static void main(String[] args) {


        // Hash Table array Implementation
        int[] hashTable = new int[10];

        // int array for testing
        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };

        // iterate through numsToAdd; hash each element to corresponding index of hashTable
        for(int i = 0; i < numsToAdd.length; i++) {
            // hash value
            int bucketIndex = hash(numsToAdd[i]);
            hashTable[bucketIndex] = numsToAdd[i];
        }

        // Print HashTable
        System.out.println("\nAfter hash");
        for(int i = 0; i < hashTable.length; i++) {
            System.out.print(hashTable[i] + " ");
        }


        // Get a number
        System.out.println("\n=============================");
        System.out.println("Retrieving 99: " + get(99, hashTable));
    }

    // hashing function
    public static int hash(int num) {
        return Math.abs(num % 10);
    }

    // retrieve a number
    public static int get(int num, int[] hashTable) {
        int bucketIndex = hash(num);

        return hashTable[bucketIndex];
    }
}
