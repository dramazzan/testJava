package Test.Singelton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWords {
    private List<String> words;
    private Random random;

    public RandomWords() {
        words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("grape");
        words.add("kiwi");
        random = new Random();
    }

    public String getRandomWord() {
        if (words.isEmpty()) {
            return null;
        }
        int index = random.nextInt(words.size());
        return words.get(index);
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void removeWord(String word) {
        words.remove(word);
    }
}
