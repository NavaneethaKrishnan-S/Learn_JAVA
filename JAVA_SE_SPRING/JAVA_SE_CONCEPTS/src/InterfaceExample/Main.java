
package InterfaceExample;

public class Main {
    public static void main(String[] args) {
        //MarioGame game = new MarioGame();
        //PacmanGame game = new PacmanGame();
        SuperContra game = new SuperContra();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
