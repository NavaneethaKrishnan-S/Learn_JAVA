
package MathClassDemo;

public class MathClassExample {
    public static void main(String[] args) {
//        int result = Math.round(1.59F);
        int result = (int)Math.round(Math.random() * 100);
        //double result = Math.max(10, 30);
//        double result = Math.random();
        System.out.println(result);
    }
}
