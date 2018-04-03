package lab7;

import java.util.ArrayList;
import java.util.List;

class Board {

    private List<String> words = new ArrayList<>();
//    private int playerIndex;
//    private int numberOfPlayers;
//
    void addWord(Player player, String s) {
        System.out.println("Player" + player + " submitted the word " + s );
        words.add(s);
    }
//
//    private void nextPlayer() {
//        playerIndex++;
//        if (playerIndex > numberOfPlayers) {
//            playerIndex = 1;
//        }
//
//        System.out.println("Board - next player:" + playerIndex);
//
//    }

    private int playerIndex = 1;
    private int numberOfPlayers;

    Board(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    private void nextPlayer() {
        playerIndex++;
        if (playerIndex > numberOfPlayers) {
            playerIndex = 1;
        }

        System.out.println("Board - next player:" + playerIndex);

    }

    synchronized int curentPlayer() {
        return playerIndex;
    }

    synchronized void postWord(int playerIndex, String word) {
    	System.out.println("ScrabbleBoard - word posted:" + word);

        nextPlayer();

    }
}
