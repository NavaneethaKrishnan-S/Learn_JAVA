package ControlFlow;

public class IfStatement {
    public static void main(String[] args) {
        int temperature = 40;
        
        if(temperature > 30){
            System.out.println("It's a hot day.");
            System.out.println("Drink plenty of water.");
        }
        else if(temperature > 20){
            System.out.println("Normal day");
        }
        else
            System.out.println("COLD");
            
    }
}
