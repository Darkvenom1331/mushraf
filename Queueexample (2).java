import java.util.Queue;
import java.util.LinkedList;
public class QueueExample
{
public static void main(String[]args)
{
 Queue<String>locationsQueue=new LinkedList<String>();
 locationsQueue.add("chennai");
 locationsQueue.add("mumbai");
 locationsQueue.add("hyderbad");   
 locationsQueue.add("lucknow");
 locationsQueue.add("bengaluru");
 System.out.println("Queue is:"+locationsQueue);
 System.out.println("head of Queue:"+locationsQueue.peek());
 locationsQueue.remove();
 System.out.println("after removing head of Queue:"+locationsQueue);
 System.out.println("size of Queue:"+locationsQueue.size());
}
}