package lab7;
/*
 * Dorin face aici
 */
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

class Game {
    private Bag bag;
    private Board board;
    private Dictionary dictionary;
    private final List<Player> players = new ArrayList<>();
    void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }
    //Create getters and setters
    //Create the method that will start the game: start one thread for each player
	/**
	 * @return the bag
	 */
    Bag getBag() {
		return bag;
	}
	/**
	 * @param bag the bag to set
	 */
    void setBag(Bag bag) {
		this.bag = bag;
	}
	/**
	 * @return the board
	 */
    Board getBoard() {
		return board;
	}
	/**
	 * @param board the board to set
	 */
    void setBoard(Board board) {
		this.board = board;
	}

    void start() {
		for (Player p: players) {
			new Thread(p).start();
		}
    }
}