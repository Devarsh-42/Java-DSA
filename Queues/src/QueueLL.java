public class QueueLL {
    public static class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
            this.next = null;
        }
    }
    static class Queues {
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (head == null) {//if The Queue is Empty
                head = tail = newNode;
            }
            tail.next = newNode;//The second Last Element's ref variable to new Node--> Linking.
            tail = newNode;//Assigning the value of newNode To Tail
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("The Queue is Empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("null");
                return -1;
            }
            return head.data;
        }

        public void show() {
            while (!isEmpty()) {
                System.out.print(peek() + "-->");
                dequeue();
            }
            if (isEmpty()) {
                System.out.println("null");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Queues n = new Queues();
        //TC of all The Functions : O(1) --> Only one End is accessed at a time
        n.enqueue(5);
        n.enqueue(10);
        n.enqueue(15);
        n.show();
//        System.out.println("Dequeued: " + n.dequeue());
//        System.out.println("Dequeued: " + n.dequeue());
//        System.out.println("Dequeued: " + n.dequeue());
    }
}
