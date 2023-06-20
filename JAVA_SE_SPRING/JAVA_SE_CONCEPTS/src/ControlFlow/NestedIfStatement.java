
package ControlFlow;

public class NestedIfStatement {
    public static void main(String[] args) {
        /*
        if distance greater than 20
            bus
        if has bike 
            if has petrol
                Let's ride.
        */
        int distance = 18;
        boolean hasBike = true;
        boolean hasPetrol = false;
        
        if(distance < 20){
            if(hasBike){
                if(hasPetrol){
                    System.out.println("Let's ride.");
                }
                else{
                    System.out.println("Fill petrol.");
                }
            }
            else{
                System.out.println("Ask friend");
            }                                  
        }
        else{
            System.out.println("Go to bus stop.");
        }
            
    }
}
