package lab7;

public class Game {
    private Bag bag;
    private Board board;
    private Dictionary dictionary;
    private final List<Player> players = new ArrayList<>();
    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }
    //Create getters and setters
    //Create the method that will start the game: start one thread for each player
}