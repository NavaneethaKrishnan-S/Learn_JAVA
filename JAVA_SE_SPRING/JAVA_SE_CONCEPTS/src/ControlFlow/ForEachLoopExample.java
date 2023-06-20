
package ControlFlow;

public class ForEachLoopExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange", "Banana"};
//        for(int i = fruits.length - 1; i >= 0; i--)
//            System.out.println(fruits[i]);
        
        for(var fruit : fruits)
            System.out.println(fruit);
    }
}
