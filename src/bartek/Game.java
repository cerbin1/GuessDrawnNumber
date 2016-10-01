package bartek;

import java.util.Scanner;

class Game {
    int difficulty;
    private Player player = new Player(0);

    Game() {
        difficulty = 0;
    }

    private Scanner reader = new Scanner(System.in);

    private int getNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Zgadnij jaka liczbe wylosowalem: ");
        return reader.nextInt();
    }

    int randomNumber(int difficulty) { // TODO to powinno nie zwracac nic i nie przyjmowac parametru
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

    int getDifficultyNumber() { // TODO to do innej klasy
        System.out.println("Podaj poziom trudnosci 1 - easy, 2 - medium, 3 - hard");
        try {
            this.difficulty = Integer.parseInt(reader.nextLine());
        } catch (NumberFormatException n) {
            System.out.print("");
        }
        return difficulty;
    }

    void runTheGame(int drawnNumber) {
        System.out.println("Wylosowalem liczbe");
        while (true) {
            int guessedNumber = getNumber();
            if (guessedNumber == drawnNumber) {
                System.out.println("Wygrales");
                System.out.println("Popelniles " + player.tries + " bledow.");
                break;
            } else {
                System.out.println("Nie udalo sie odgadnac liczby, sprobuj jeszcze raz :)");
                player.incrementTries();
                if (drawnNumber > guessedNumber) {
                    System.out.println("Wylosowana liczba jest wieksza");
                } else {
                    System.out.println("Wylosowana liczba jest mniejsza");
                }
            }
        }
    }
}