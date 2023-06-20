
package ControlFlow;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("INPUT >> ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }
    }
}
