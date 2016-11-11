package bartek;

import java.util.Scanner;

class Game {
    private Player player = new Player();
    private Scanner reader = new Scanner(System.in);


    void runTheGame() {
        player.setDifficultyLevel();
        int drawnNumber = randomNumber(player.getDifficulty());
        Console.displayThatNumberIsDrawn();
        while (true) {
            player.setGuessNumber();
            if (player.getGuessNumber() == drawnNumber) {
                System.out.println("Wygrales");
                System.out.println("Popelniles " + player.getTries() + " bledow.");
                break;
            } else {
                player.incrementTries();
                if (player.checkIfNumber()) {
                    System.out.println("Nie udalo sie odgadnac liczby, sprobuj jeszcze raz :)");
                    if (drawnNumber > player.getGuessNumber()) {
                        System.out.println("Wylosowana liczba jest wieksza");
                    } else {
                        System.out.println("Wylosowana liczba jest mniejsza");
                    }
                }
            }
        }
    }

    private int getNumberToGuess() {
        System.out.println("Zgadnij jaka liczbe wylosowalem: "); //TODO
        return reader.nextInt();
    }

    private int randomNumber(int difficulty) { // TODO to powinno nie zwracac nic i nie przyjmowac parametru
        switch (difficulty) {
            case 1:
                return (int) (Math.random() * 10);
            case 2:
                return (int) (Math.random() * 100);
            case 3:
                return (int) (Math.random() * 1000);
            default:
                System.out.println("Zle dane!");
                return 0;
        }
    }

}