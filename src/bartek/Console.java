package bartek;

class Console {
    private String[] difficultyNames = {"easy", "medium", "hard"};

    static void displayWrongMenuOption() {
        System.out.println("You chose wrong menu option. Try it again");
    }

    static void askForDifficultyLevel() {
        System.out.println("Choose difficulty level: 1 - easy, 2 - medium, 3 - hard.");
    }

    static void displayNumberIsNotCorrect() {
        System.err.println("You did not put correct number. Try it again.");
    }
    static void displayThatNumberIsDrawn() {
        System.out.println("I have drawn a number!");
    }
    String getDifficultyName(int number) {
        return difficultyNames[number];
    }

    static void askForNumberToGuess() {
        System.out.println("Try guess number");
    }
}
