
package ControlFlow;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(true){
            System.out.print("INPUT >> ");
            input = scanner.nextLine().toLowerCase();
            if(input.equals("quit"))
                break;
            if(input.equals("pass"))
                continue;
            System.out.println(input);
            
        }
    }
}
