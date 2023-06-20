
package InterfaceExample;

public class GameRunner {
    public GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    
    public void run(){
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
    
}
