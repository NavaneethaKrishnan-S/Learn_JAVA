
package ArraysExample;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] fruits = new String[5];
        
        fruits[1] = "Banana";
        fruits[2] = "Grapes";
        fruits[0] = "Apple";
//        Arrays.sort(numbers);
        System.out.println(fruits);
        System.out.println(Arrays.toString(fruits));
    }
}
