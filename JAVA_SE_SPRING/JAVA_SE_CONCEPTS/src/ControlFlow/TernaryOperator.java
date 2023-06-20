
package ControlFlow;

public class TernaryOperator {
    public static void main(String[] args) {
        int income = 20_000;
        String className = (income > 1_00_000) ? "First" : "Economy";
        System.out.println(className);
    }
}
