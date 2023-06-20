
package CollectionFramework.SetInterface;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void show(){
        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("a","b","d","e"));
        
        //UNION
//        set1.addAll(set2);
//        System.out.println(set1);

        //INTERSECTION
//        set1.retainAll(set2);
//        System.out.println(set1);
        
        //DIFFERENCE
        
        set1.removeAll(set2);
        System.out.println(set1);
        
//        set.add("Aashiq");
//        set.add("Amaresh V");
//        set.add("Siva ranjani");
//        set.add("Amaresh R");
        
        
        //System.out.println(set);
        
    }
}
