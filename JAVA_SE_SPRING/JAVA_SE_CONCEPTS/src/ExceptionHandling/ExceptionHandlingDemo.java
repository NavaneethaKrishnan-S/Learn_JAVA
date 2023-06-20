
package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {
    public static void show(){
        var account = new Account();
        account.deposit(0);
//        try {            
//            var reader = new FileReader("file.txt");
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}
//public static void show(){
//        sayHello("null");
//    }
//
//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }