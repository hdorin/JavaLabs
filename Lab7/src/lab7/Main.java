package lab7;

public class Main {

	public static void main(String[] args) {

		Game game = new Game();
		Player player1,player2,player3;
		Board board = new Board(3);
		player1=new Player(1, board);
		player2=new Player(2, board);
		player3=new Player(3, board);
		TimeKeeper time=new TimeKeeper(player1);
		game.setBag(new Bag());
		game.setBoard(board);
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.addPlayer(player3);
		time.start();
		game.start();

	}


}
