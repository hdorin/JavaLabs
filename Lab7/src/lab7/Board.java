package lab7;

import java.util.List;

class Board {

    List<String> words;
    void addWord(Player player, String s) {
        System.out.println("Player" + player + " submitted the word " + s );
        words.add(s);
    }

}
