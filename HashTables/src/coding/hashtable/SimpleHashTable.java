package coding.hashtable;

public class SimpleHashTable {

    // simple hash table array implementation
    private StoredPlayer[] hashTable;

    // constructor
    public SimpleHashTable() {
        hashTable = new StoredPlayer[10];
    }

    // Pass in a String key
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    // Remove player
    public Player remove(String lastName) {
        int bucket = findKey(lastName);

        if (bucket != -1) {
            Player delete = hashTable[bucket].player;
            hashTable[bucket] = new StoredPlayer("DELETED");
            return delete;
        }

        return null;
    }


    // Retrieve Player from Hash Table bucket
    public Player getPlayer(String lastName) {
        int bucket = findKey(lastName);
        // check if the player is at that bucket
        if(bucket != -1) {
            return hashTable[bucket].player;
        }
        else {
            System.out.println("Sorry Player not found.");
            return null;
        }
    }

    private int findKey(String lastName) {

        int hashedKey = hashKey(lastName);
        // check to see if the bucket's key matches the hashed key; if they match return
        if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(lastName)) {
            return hashedKey;
        }

        // but if they do not match it might be placed in another bucket
        else {
            int startIndex = hashedKey;
            do {
                startIndex++;

                if(startIndex >= hashTable.length) {
                    startIndex = 0;
                }

                if(hashTable[startIndex] == null) {
                    return -1;
                }

                if(hashTable[startIndex].key.equals(lastName)) {
                    return startIndex;
                }
            } while (startIndex != hashedKey); // we have gone full circle
        }

        // not found
        return  -1;
    }

    // Put an Player in the Hash Table
    void put(String lastName, Player player) {

        int hashedKey =  hashKey(lastName);
        int startIndex = hashedKey;

        // linear probing
        if(occupied(hashedKey)) {
            do {
                startIndex++;

                if(startIndex >= hashTable.length) {
                    startIndex = 0;
                }
                if(!(occupied(startIndex))) {
                    hashTable[startIndex] = new StoredPlayer(lastName, player);
                    return;
                }

            } while (startIndex != hashedKey); // stop if you reach hashed key; going in circles
            System.out.println("\nwe have made a full loop\n");
        }

        else if (!(occupied(hashedKey))) {
            hashTable[hashedKey] = new StoredPlayer(lastName, player);
            return;
        }
        // we have made a fool loop hash table is full
            System.out.println("\n============================\nSorry we tried to add\n "
                    + player + "\nhowever bucket " + hashedKey + " is occupied by:\n" +
                    hashTable[hashedKey].player + "\nand the rest of the table is FULL\n" +
                    "===========================");
    }

    // check if the hash table bucket is occupied by a player
    public boolean occupied(int hashedKey) {
        if(hashTable[hashedKey] == null) {
            return false;
        }
        return true;
    }

    // Print Hash Table
    public void printHashTable() {
        for(int i = 0; i < hashTable.length; i++) {
            if(hashTable[i] == null) {
                System.out.println("\nBucket " + i);
                System.out.println("Empty\n");
            }
            else {
                System.out.println("\nBucket " + i);
                System.out.println(hashTable[i].player);
            }
        }
    }

} // end of SimpleHashTable Class
