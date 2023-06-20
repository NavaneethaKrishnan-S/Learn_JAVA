
package Types;

import java.awt.Point;

public class ReferenceTypeExample {
    public static void main(String[] args) {
        int age = 21;
        int herAge = age;
        age = 22;
        System.out.println(herAge);
        
        Point point1 = new Point(10, 20);
        Point point2 = point1;
        //System.out.println(point1.x);
        point1.x = 100;
        System.out.println(point2);
        //System.out.println();
        
        
        
        
    }
}
