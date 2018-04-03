package lab7;

public class Main {

	public static void main(String[] args) {

		Game game = new Game();
		game.setBag(new Bag());

		Board board = new Board(3);
		game.setBoard(board);
		game.addPlayer(new Player(1, board));
		game.addPlayer(new Player(2, board));
		game.addPlayer(new Player(3, board));
		game.start();

	}

}
