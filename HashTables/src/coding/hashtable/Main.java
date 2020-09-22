package coding.hashtable;

public class Main {

    public static void main(String[] args) {

        // Create list of Players
        Player zidane  = new Player("Zinidine", "Ziz", 5);
        Player pepe   = new Player("Crazy", "Pepe", 4);
        Player messi   = new Player("Lionel", "messi", 10);
        Player isco  = new Player("fran", "isco", 23);
        Player ramos  = new Player("sergio", "ramos", 5);
        Player kroos  = new Player("Tony", "Kroos", 8);
        Player modric    = new Player("Lucka", "Modric", 10);
        Player hazard  = new Player("Eden", "Hazard", 10);
        Player ronaldo = new Player("Cristiano", "Ronaldo", 7);
        Player casemiro  = new Player("carlos", "Casemiro", 6);
        Player robert    = new Player("Robert", "Lewandowski", 9);


        // hash table
        SimpleHashTable table = new SimpleHashTable();

        // print table
        //System.out.println("Player Table Before: ");
        //table.printHashTable();

        // add players to hash table
        table.put(zidane.getLastName(), zidane);
        table.put(pepe.getLastName(), pepe);
        table.put(messi.getLastName(), messi);
        table.put(isco.getLastName(), isco);
        table.put(ramos.getLastName(), ramos);
        table.put(kroos.getLastName(), kroos);
        table.put(modric.getLastName(), modric);
        table.put(hazard.getLastName(), hazard);
        table.put(ronaldo.getLastName(), ronaldo);
        table.put(casemiro.getLastName(), casemiro);
        table.put(robert.getLastName(), robert);


        // print table
        System.out.println("\nPlayer Table After: ");
        table.printHashTable();

        // search for a player
        System.out.println("========================================");
        System.out.println("\n Looking for Ronaldo:");
        Player search = table.getPlayer(ronaldo.getLastName());
        System.out.println(search);
 /*       System.out.println("\n Looking for Robert:");
        search = table.getPlayer(robert.getLastName());
        System.out.println(search);*/


        // Remove players
        table.remove(ronaldo.getLastName());
        table.remove(zidane.getLastName());

        // print table
        System.out.println("==========================================");
        System.out.println("\nPlayer Table After Removals: ");
        table.printHashTable();

        System.out.println("==========================================");
        System.out.println("\n Looking for Casemiro:");
        search = table.getPlayer(casemiro.getLastName());
        System.out.println(search);

        System.out.println("\n Looking for Crazy Pepe:");
        search = table.getPlayer(pepe.getLastName());
        System.out.println(search);



    } // end of main


} // end of class
