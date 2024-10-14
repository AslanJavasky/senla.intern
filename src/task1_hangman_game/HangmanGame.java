package task1_hangman_game;

import java.util.Scanner;

public class HangmanGame {
    private static final int MAX_LIVES = 6;
    private static final WordBank wordBank = new WordBank();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToGuess = wordBank.getRandomWord();
        char[] guessedWord = new char[wordToGuess.length()];
        int lives = MAX_LIVES;

        // Initialize guessedWord with dashes
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        while (lives > 0) {
            System.out.println("Word to guess: " + String.valueOf(guessedWord));
            System.out.println("Lives left: " + lives);
            System.out.println("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                lives--;
            }

            if (String.valueOf(guessedWord).equals(wordToGuess)) {
                System.out.println("Congratulations! You guessed the word.");
                break;
            }
        }

        if (lives == 0) {
            System.out.println("You ran out of lives. The word was: " + wordToGuess);
        }

        scanner.close();
    }
}

