package MortgageCalculatorUsingOOPs;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
        
        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator);
        
        report.printMortgage(principal, annualInterest, years);
        report.printPaymentSchedule(principal, annualInterest, years);
    }
}
/*
METHOD - function/behaviour
attributes - data or field
Properties - CLASS -> methods + attributes
getters - used to get access the private field of class.
setters - used to set the data in a private field of class.
*/
