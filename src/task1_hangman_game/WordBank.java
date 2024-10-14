package task1_hangman_game;

import java.util.Random;

public class WordBank {
    private static final String[] words = {"hangman", "computer", "java", "programming", "developer"};

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }
}

