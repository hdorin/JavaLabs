package lab7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Dorin face aici
 */
class Bag {
    private final Queue<Character> letters = new LinkedList<>();
    Bag() { // Add all the letters from 'a' to 'z' in the bag.
    	for(char i='a';i<='z';i++) {
    		letters.add(i);
    	}
    }
    
    synchronized List<Character> extractLetters(int howMany) {
        // Replace the dots so that the bag is thread-safe
        List<Character> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (letters.isEmpty()) break;
            extracted.add(letters.poll());
        }
        return extracted;
    }
}