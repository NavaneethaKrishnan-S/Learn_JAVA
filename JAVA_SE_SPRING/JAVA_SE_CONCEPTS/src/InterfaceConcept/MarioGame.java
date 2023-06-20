
package InterfaceConcept;

public class MarioGame implements GamingConsole{
    @Override
    public void up(){
        System.out.println("Jump");
    }
    
    @Override
    public void right(){
        System.out.println("Move forward");
    }
    
    @Override
    public void left(){
        System.out.println("Go back");
    }
    
    @Override
    public void down(){
        System.out.println("Go into the hole");
    }
}
