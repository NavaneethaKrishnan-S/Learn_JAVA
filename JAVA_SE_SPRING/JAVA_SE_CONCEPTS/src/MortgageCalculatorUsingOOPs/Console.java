
package MortgageCalculatorUsingOOPs;

import java.util.Scanner;

public class Console {
    
    public static Scanner scanner;
    public static double readNumber(String prompt, 
                                        double min, 
                                            double max) {
        
        scanner = new Scanner(System.in);
        double value;
        
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    
    public static double readNumber(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
