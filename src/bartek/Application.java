package bartek;


public class Application {
    private Player player = new Player(0, 0);

    private void start() {
        Game game = new Game();
        while (true) {
            player.setDifficultyNumber();
            if (player.getDifficulty() > 0 && player.getDifficulty() < 4) {
                break;
            } else {
                System.out.println("Niepoprawne dane!");
            }
        }
        int number = game.randomNumber(player.getDifficulty());
        game.runTheGame(number);
    }

    public static void main(String[] args) {
        new Application().start();
    }

}
