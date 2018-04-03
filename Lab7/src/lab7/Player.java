package lab7;

import java.util.List;

public class Player implements Runnable {
    private String name;
    private Game game;

//    Player(String name){
//        this.name = name;
//    }

    private int index;
    private Board board;
    private static boolean gameOver = false;

    public static boolean isGameOver() {
		return gameOver;
	}

	Player(int index, Board board) {
        this.index = index;
        this.board = board;
    }

//    private boolean createSubmitWord() throws InterruptedException {
//        List extracted = game.getBag().extractLetters(1);
//        if (extracted.isEmpty()) {
//            return false;
//        }
//        StringBuilder word = new StringBuilder();
//        for (int i = 0; i < 10; i++) {
//            word.append(extracted.get(0));
//        }
//        game.getBoard().addWord(this, word.toString());
//        Thread.sleep(300);
//        return true;
//	}


    private StringBuilder createSubmitWord() throws InterruptedException, IndexOutOfBoundsException {
        List extracted = game.getBag().extractLetters(1);
        if (extracted.isEmpty()) {
            System.out.println("Game is over!");
            gameOver=true;
            return null;
        }
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            try {
                word.append(extracted.get(0));
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
        return word;
    }

    //implement the run() method, that will repeatedly create and submit words
    //implement the toString() method

//    @Override
//    public void run() {
//        while(true){
//            try {
//                if (!createSubmitWord()) break;
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public void run() {
        while(!gameOver) {
            if (index == board.curentPlayer()) {
                System.out.println("Player " + index + " - My turn. Post word");
                try {
                	StringBuilder submittedWord=createSubmitWord();
                    if(!gameOver) {
                    	board.postWord(index, "Player " + index + submittedWord);
                    }else {
                    	return ;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Player " + index + " - Waiting for my turn. Thinking of word");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.yield();
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

    void setGame(Game game) {
        this.game = game;
    }
}
