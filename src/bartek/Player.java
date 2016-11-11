package bartek;

import java.util.Scanner;

class Player {
    private Scanner reader = new Scanner(System.in);
    private Console console = new Console();

    private int tries;
    private int difficulty;
    private int guessNumber;

    Player() {
        tries = 0;
        difficulty = 0;
    }

    void incrementTries() {
        tries++;
    }

    void setDifficultyLevel() {
        while (true) {
            try {
                Console.askForDifficultyLevel();
                difficulty = Integer.parseInt(reader.nextLine());
                if (difficulty > 0 && difficulty < 4) {
                    System.out.println("you chose " + console.getDifficultyName(difficulty - 1));
                    break;
                } else {
                    Console.displayWrongMenuOption();
                }
            } catch (NumberFormatException n) {
                Console.displayNumberIsNotCorrect();
            }

        }
    }

    boolean checkIfNumber() {
        return this.guessNumber > 0;
    }

    void setGuessNumber() {
        try {
            Console.askForNumberToGuess();
            guessNumber = Integer.parseInt(reader.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Wrong input");
        }
    }

    int getGuessNumber() {
        return guessNumber;
    }

    int getDifficulty() {
        return difficulty;
    }

    int getTries() {
        return tries;
    }
}
