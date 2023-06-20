
package CollectionFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("b");
        queue.add("a");
        queue.offer("z");
        
        //queue.remove();
        queue.poll();
        //var front = queue.peek();
        
        System.out.println(queue);
        //System.out.println(front);
    }
}
