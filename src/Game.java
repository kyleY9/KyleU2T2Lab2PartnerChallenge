public class Game {
    // instance variables (a.k.a. fields, properties, attributes, "state", data)
    private String gameName;
    private int players;
    private int score;
    private int fouls;

    // constructor
    public Game(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
        score = 0; // default value
        fouls = 0; // default value
    }

    // returns the name of the game
    public String getGameName() {
        return gameName;
    }

    // returns the number of players
    public int getPlayers() {
        return players;
    }

    // returns the current score
    public int getScore() {
        return score;
    }

    // returns the current number of fouls
    public int getFouls() {
        return fouls;
    }


    // increments the number of players by 1;
    // this method has no return value (void)
    public void addPlayer() {
        players++;
    }

    // increments the game's score by the value of an int parameter named "increase";
    // this method has no return value (void)
    public void increaseScore(int increment) {
        score += increment;
    }

    // increments the game's fouls by the value of the "increment" parameter
    public void increaseFouls(int increment) {
        fouls += increment;
        score -= 2*increment;
    }

    // calculates and returns the average score per player as a double
    public double averageScorePerPlayer() {
        return (double) score/players;
    }


    // returns true if score > 9, otherwise returns false
    public boolean isGameOver() {
        if (score > 9) {
            return true;
        } else {
            return false;
        }
    }
}

