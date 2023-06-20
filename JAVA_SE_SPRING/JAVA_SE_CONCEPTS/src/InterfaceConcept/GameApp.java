
package InterfaceConcept;

public class GameApp {
    public static void main(String[] args) {
        var game = new PacmanGame();
        var game1 = new SuperContraGame();
        //var game = new MarioGame();
        var gameRunner = new GameRunner(game);
        var gameRunner1 = new GameRunner(game1);
        gameRunner.run();
        gameRunner1.run();
    }
}
