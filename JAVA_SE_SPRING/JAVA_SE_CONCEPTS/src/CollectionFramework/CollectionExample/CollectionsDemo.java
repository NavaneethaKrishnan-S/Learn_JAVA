
package CollectionFramework.CollectionExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection <String> collection = new ArrayList<>();
//        collection.add("Amaresh");
//        collection.add("Muhammed Aashiq");
//        collection.add("Siva ranjani");
        
        Collections.addAll(collection, "Amaresh", "Aashiq", "Ranjani");
//        collection.remove("Amaresh");
//        collection.clear();
        System.out.println(collection.contains("Aashiq"));
        System.out.println(collection);
    }
}
