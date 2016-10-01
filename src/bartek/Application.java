package bartek;

import java.util.Scanner;

public class Application {
    private final static Scanner reader = new Scanner(System.in); // TODO nieużywana zmienna

    private void start() {
        boolean variable = true; // TODO wywal zmienna
        Game game = new Game();
        while (variable) {
            game.difficulty = game.getDifficultyNumber();
            if (game.difficulty > 0 && game.difficulty < 4) {
                variable = false;  // TODO zamien na breaka
            } else {
                System.out.println("Niepoprawne dane!");
            }
        }
        int number = game.randomNumber(game.difficulty);
        game.runTheGame(number);
    }

    public static void main(String[] args) {
        new Application().start();
    }

}
