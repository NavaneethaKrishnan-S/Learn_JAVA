package ScannerClassExample;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
//        System.out.println("Enter your age: ");
//        byte age = scanner.nextByte();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("your name is " + name);
    }
}
