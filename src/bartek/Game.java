package bartek;

import java.util.Scanner;

class Game {
    private Player player = new Player(0, 0);
    private Scanner reader = new Scanner(System.in);



    private int getNumber() {
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