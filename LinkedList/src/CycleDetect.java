import java.util.LinkedList;
public class CycleDetect {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("The LL is Empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isCycle() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Cycle exists");
                return true; // Cycle Found.
            }
        }
        System.out.println("Cycle does not exist");
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == true) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            prev.next = null; // Remove the cycle
        }
    }


    public static void main(String[] args) {
        CycleDetect ll = new CycleDetect();
        ll.printLL();
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(8);
        ll.addFirst(10);
        ll.addFirst(3);
        ll.printLL();
        // Create a cycle
        ll.head.next.next.next.next.next = ll.head;

        ll.isCycle();
        ll.removeCycle();
        ll.isCycle();
        ll.printLL();

        //LinkedList Using JCF: Basically Above Code is Meaningless :)

        //Create--Cannot Primitive DT, Can use only Objects o fClasses Like: Integer, Float,etc
        LinkedList<Integer> LL = new LinkedList<>();

        //add
        LL.addFirst(3);
        LL.addFirst(4);
        LL.add(2,8);
        LL.add(3,19);
        LL.addLast(9);
        LL.addLast(10);
        LL.addLast(15);
        System.out.println(LL);

        //remove
        LL.removeFirst();
        LL.removeLast();
        System.out.println(LL);

    }
}
