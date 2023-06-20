
package Types;

import java.awt.Point;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        byte myAge = 21;
        byte herAge = myAge;
        myAge = 22;
        System.out.println(herAge);
        
        
        Point point1 = new Point(10, 20);
//        point1.x = 10;
//        point1.y = 20;

        Point point2 = new Point(40, 70);
        point1.x = 50;
        
        System.out.println(point2.x);
        
    }
}
