
package Types;

public class TypeCasting {
    public static void main(String[] args) {
        //IMPLICIT TYPE CASTING
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
        
//EXPLICIT TYPE CASTING
//        double x = 1.1;
//        int y = (int)x + 1;
//        System.out.println(y);

        String number = "1a";
        int x = Integer.parseInt(number);
        int y = x + 1;
        System.out.println(y);
    }
}
