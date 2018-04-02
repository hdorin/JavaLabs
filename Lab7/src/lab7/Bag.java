package lab7;

public class Bag {
    private final Queue<Character> letters = new LinkedList<>();
    public Bag() { // Add all the letters from 'a' to 'z' in the bag. }
    public ........... List<Character> extractLetters(int howMany) {
        // Replace the dots so that the bag is thread-safe
        List<Character> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (letters.isEmpty()) break;
            extracted.add(letters.poll());
        }
        return extracted;
    }
}