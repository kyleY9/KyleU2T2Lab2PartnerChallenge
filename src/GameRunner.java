import java.text.DecimalFormat;

public class GameRunner {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Game game = new Game("Volleyball", 12);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Fouls: " + game.getFouls());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("----- UPDATING STATE OF GAME -----");
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(8);
        game.increaseScore(3);
        game.increaseFouls(2);
        game.increaseFouls(1);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore() + " (-" + game.getFouls()*2 + " from fouls)");
        System.out.println("Fouls: " + game.getFouls());
        System.out.println("Avg score per player: " + df.format(game.averageScorePerPlayer()));
        System.out.println("Is game over? " + game.isGameOver());
    }
}

