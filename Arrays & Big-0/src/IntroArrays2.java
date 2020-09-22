public class IntroArrays2 {

    public static <T> void printStuff(T[] arrayList) {

    }

    public static void main(String[] args) {


        // create array of different data types
        int[] numArray       = new int[5];
        String[] strArray    = new String[5];
        Player[] playerArray = new Player[5];

        // add elements
        numArray[0] = 45;
        numArray[1] = 33;

        strArray[0] = "rafa";
        strArray[1] = "athony";

        Player rafa = new Player("rafa", "galindo", 4);
        Player anto = new Player("anthony", "amaya", 4);

        playerArray[0] = rafa;
        playerArray[1] = anto;
    }
}
