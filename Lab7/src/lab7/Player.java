package lab7;

import java.util.List;

public class Player implements Runnable {
    private String name;
    private Game game;

    Player(String name){
        this.name = name;
    }

    private boolean createSubmitWord() throws InterruptedException {
        List extracted = game.getBag().extractLetters(1);
        if (extracted.isEmpty()) {
            return false;
        }
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            word.append(extracted.get(0));
        }
        game.getBoard().addWord(this, word.toString());
        Thread.sleep(300);
        return true;
	}
    //implement the run() method, that will repeatedly create and submit words
    //implement the toString() method

    @Override
    public void run() {
        while(true){
            try {
                if (!createSubmitWord()) break;
            } catch (InterruptedException e) {
                e.printStackTrace();
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
