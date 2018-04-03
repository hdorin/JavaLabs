package lab7;
/*
 * Dorin face aici
 */
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

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
    public void startGame() {
    	Thread t;
    	for(Player plyr : players) {
    		t=new Thread(plyr);
    		t.start();
    	}
    }
	/**
	 * @return the bag
	 */
	public Bag getBag() {
		return bag;
	}
	/**
	 * @param bag the bag to set
	 */
	public void setBag(Bag bag) {
		this.bag = bag;
	}
	/**
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}
	/**
	 * @param board the board to set
	 */
	public void setBoard(Board board) {
		this.board = board;
	}
}