package ControlFlow;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for tamil");
        System.out.println("Enter 2 for English");
        System.out.println("Enter 3 for Hindi");
        System.out.print("Enter your choice: ");
        
        int number = scanner.nextInt();
        
        switch(number){
            case 1:
                System.out.println("tamil");
                break;
            case 2:
                System.out.println("english");
                break;
            case 3:
                System.out.println("hindi");
                break;
            default:
                System.out.println("Guest");
        }
    }
}
