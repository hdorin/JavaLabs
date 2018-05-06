package lab7;

import java.util.ArrayList;

public interface Dictionary {

    ArrayList<String> words = new ArrayList<>();

    static boolean containsWord(String str) {
        return words.contains(str);
    }
}
