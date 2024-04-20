import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingJCF {
    public static void main(String[] arg){
        Queue<Integer> q = new  LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + "-->");
            q.remove();
         }
        if (q.isEmpty()) {
            System.out.println("null");
            return;
        }
    }
}
