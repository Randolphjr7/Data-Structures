package coding.hashtable;

public class StoredPlayer {
    public String key;
    public Player player;

    StoredPlayer(String key, Player player) {
        this.key = key;
        this.player = player;
    }

    StoredPlayer(String key) {
        this.key = key;
    }
}
