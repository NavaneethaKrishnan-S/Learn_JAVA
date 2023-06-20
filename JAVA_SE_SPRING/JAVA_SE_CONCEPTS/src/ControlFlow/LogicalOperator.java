
package ControlFlow;

public class LogicalOperator {
    public static void main(String[] args) {
//        int temperature = 18;
//        boolean isCold = temperature > 10 && temperature < 20;
//        System.out.println(isCold);
        
        boolean hasHighIncome = false;
        boolean hasGoodCredits = false;
        boolean hasCriminalRecord = false;
        
        boolean isEligible = (hasHighIncome || hasGoodCredits)
                                && !hasCriminalRecord;
        
        System.out.println(isEligible);
    }
}
