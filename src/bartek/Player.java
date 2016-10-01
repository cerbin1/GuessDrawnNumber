package bartek;

class Player {
    int tries;

    Player(int number) {
        this.tries = number;
    }

    void incrementTries() {
        tries++;
    }
}
