package lab7;

import java.util.ArrayList;
import java.util.List;

class Board {

    private List<String> words = new ArrayList<>();
    void addWord(Player player, String s) {
        System.out.println("Player" + player + " submitted the word " + s );
        words.add(s);
    }

}
