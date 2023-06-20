
package ArraysExample;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        
        int districts = 3;
        int months = 4;
        int[][] sales = new int[months][districts];
        sales[0][0] = 50_000;
        sales[0][1] = 60_000;
        sales[0][2] = 70_000;
        
        sales[1][0] = 50_000;
//        int[][] sales = {
//                            {10, 20, 30},
//                            {40, 50, 60},
//                            {70, 80, 90}
//                        };
        
        System.out.println(Arrays.deepToString(sales));
        
    }
}
