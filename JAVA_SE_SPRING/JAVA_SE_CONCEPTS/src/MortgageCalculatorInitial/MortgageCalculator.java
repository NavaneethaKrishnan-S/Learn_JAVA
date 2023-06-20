
package MortgageCalculatorInitial;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        
        final byte PERCENT = 100;
        final byte NO_OF_MONTHS = 12;
        
        var scanner = new Scanner(System.in);
        
        System.out.print("PRINCIPAL: ");
        int principal = scanner.nextInt();
        
        System.out.print("ANNUAL INTEREST: ");
        float annualInterest = scanner.nextFloat();
        
        System.out.print("YEARS: ");
        byte years = scanner.nextByte();
        
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
