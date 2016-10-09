package bartek;

import java.util.Scanner;

class Player {
    private Scanner reader = new Scanner(System.in);

    int tries;
    private int difficulty;

    Player() {
        tries = 0;
        difficulty = 0;
    }

    void incrementTries() {
        tries++;
    }

    void setDifficultyNumber() {
        System.out.println("Podaj poziom trudnosci 1 - easy, 2 - medium, 3 - hard");
        try {
            difficulty = Integer.parseInt(reader.nextLine());
        } catch (NumberFormatException n) {
            System.err.println("Nie podales poprawnej wartosci");
        }
    }

    int getDifficulty() {
        return difficulty;
    }
}
