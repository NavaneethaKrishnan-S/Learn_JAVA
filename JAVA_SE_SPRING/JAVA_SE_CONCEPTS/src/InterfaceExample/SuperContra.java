
package InterfaceExample;

public class SuperContra implements GamingConsole{
    @Override
    public void up(){
        System.out.println("Jump");
    }
    @Override
    public void down(){
        System.out.println("Sit");
    }
    @Override
    public void right(){
        System.out.println("Shoot");
    }
    @Override
    public void left(){
        System.out.println("left");
    }
}
