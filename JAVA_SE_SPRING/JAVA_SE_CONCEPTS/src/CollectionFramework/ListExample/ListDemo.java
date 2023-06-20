
package CollectionFramework.ListExample;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("Amaresh");
        list.add("Aashiq");
        list.add("Ranjani");
        list.add("Amaresh");
            
        //list.set(1, "Ranjani");
        
        System.out.println(list.indexOf("Amaresh"));
        System.out.println(list.lastIndexOf("Amaresh"));
        System.out.println(list.subList(0, 2));
        System.out.println(list);
    }
    

    
   
}
