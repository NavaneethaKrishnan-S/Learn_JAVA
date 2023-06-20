
package MortgageCalculatorLooping;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        
        final byte PERCENT = 100;
        final byte NO_OF_MONTHS = 12;
        
        int principal;
        float annualInterest;
        byte years;
        
        var scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("PRINCIPAL: ");
            principal = scanner.nextInt();
            
            if(principal >= 1000 && principal <= 10_00_000)
                break;
            
            System.out.println("Enter a value between 1000 and 10,00,000");
        }
        
        while(true){
            System.out.print("ANNUAL INTEREST: ");
            annualInterest = scanner.nextFloat();
            
            if(annualInterest >= 1 && annualInterest <= 30)
                break;
            
            System.out.println("Enter a value between 1 and 30");
        }
        
        while(true){
            System.out.print("YEARS: ");
            years = scanner.nextByte();
            
            if(years >= 1 && years <= 30)
                break;
            
            System.out.println("Enter a value between 1 and 30");
        }
         
        float monthlyInterest = (annualInterest / PERCENT) 
                                        / NO_OF_MONTHS;
        
        int numberOfPayments = years * NO_OF_MONTHS;
               
        double mortgage = principal * (monthlyInterest *(Math.pow(1 + monthlyInterest, numberOfPayments)))
                                /((Math.pow(1 + monthlyInterest, numberOfPayments)) - 1);
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        
        System.out.println("Mortgage: " + mortgageFormatted);
   
    }
}
