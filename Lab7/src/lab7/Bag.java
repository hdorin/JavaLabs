package lab7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
/*
 * Dorin face aici
 */
class Bag {
    public Queue<Character> getLetters() {
        return letters;
    }

    private final Queue<Character> letters = new LinkedList<>();
    Bag() { // Add all the letters from 'a' to 'z' in the bag.
        Random rand = new Random();
    	for(char i=0;i<100;i++) {
//    		letters.add(i);
            int randomNum = rand.nextInt(26);
            letters.add((char)(randomNum  + 'a'));
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