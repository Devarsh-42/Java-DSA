import java.util.*;
public class QueueUsingTwoStack {
    static class Queue1 {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //Add - O(n)
        public static void add(int data) {
            while (!s1.isEmpty()) {//shifting elements from s1 to s2 until s1 is empty
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {// re-shifting s2's elements to s1, so that we get
                s1.push(s2.pop());
            }
        }

        //Remove - O(1)
        public static int remove() {
            if (s1.isEmpty()) {
                System.out.print("The Queue is empty!!");
            }
            return s1.pop();
        }

        //Peak - O(1)
        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("The Queue is Empty!!");
            }
            return s1.peek();
        }
    }
    public static void main(String[] arg){
        Queue1 q = new Queue1();
        q.add(7);
        q.add(8);
        q.add(9);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
