
package MortgageCalculatorMethod;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte PERCENT = 100;
    final static byte NO_OF_MONTHS = 12;
    public static void main(String[] args) {
        
        int principal = (int)readNumber("PRINCIPAL: ", 1000, 10_00_000);
        float annualInterest = (float)readNumber("ANNUAL INTEREST: ", 1, 30);
        byte years = (byte)readNumber("YEARS: ", 1, 30);
        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }
    
    public static double readNumber(String message,
                                        int minRange,
                                            int maxRange){
        double value;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(message);
            value = scanner.nextDouble();
            
            if(value >= minRange && value <= maxRange)
                break;
            System.out.println("Enter a value between " 
                                    + minRange + " and " + maxRange);            
        }
        return value;
    }
    public static void printMortgage(int principal, 
                                        float annualInterest, 
                                            byte years)
    {
        System.out.println("MORTGAGE REPORT");
        System.out.println("---------------");
        double mortgage = calculateMortgage(principal, annualInterest, years);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        
        System.out.println("Mortgage: " + mortgageFormatted);
    }
    
    public static void printPaymentSchedule(int principal, float annualInterest, byte years){
        
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        System.out.println();
        
        for(int month = 1; month <= years * NO_OF_MONTHS; month++){
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
    public static double calculateMortgage(int principal,
                                                float annualInterest,
                                                    byte years){
        
        
        float monthlyInterest = (annualInterest / PERCENT) 
                                        / NO_OF_MONTHS;
        
        int numberOfPayments = years * NO_OF_MONTHS;
               
        double mortgage = principal * (monthlyInterest *(Math.pow(1 + monthlyInterest, numberOfPayments)))
                                /((Math.pow(1 + monthlyInterest, numberOfPayments)) - 1);
        return mortgage;
    }

    public static double calculateBalance(int principal, 
                                            float annualInterest, 
                                                byte years, 
                                                    int month) {
        //c = monthlyInterest
        //L = loan amount or Principal
        //n = number of payments
        //p = Number of payments we have made = month
        
        float monthlyInterest = (annualInterest / PERCENT) 
                                        / NO_OF_MONTHS;
        int numberOfPayments = years * NO_OF_MONTHS;
        
        double balance = principal * ((Math.pow(1 + monthlyInterest, numberOfPayments)) - (Math.pow(1 + monthlyInterest, month)))
                         / ((Math.pow(1 + monthlyInterest, numberOfPayments)) - 1);
        return balance;
    }
}
