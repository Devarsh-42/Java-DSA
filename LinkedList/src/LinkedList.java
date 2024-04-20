import javax.sql.ConnectionPoolDataSource;

public class LinkedList {
    class Node {// Creating a node
        int data;
        Node next;// Reference Variable

        public Node(int data) { // Constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;// Static Variables of The Node Class
    public static Node tail;// Up till This, it's the Linkedlist Syntax
    public static int size;// ++ each time a new Node is created

    public void addFirst(int data) {

        // Step 1: Creating a new node:
        Node newNode = new Node(data);
        size++;

        // If the linked list is empty
        if (head == null) {
            head = tail = newNode;
        } else {

            // Step 2: Link the new node to the current head
            newNode.next = head;

            // Step 3: Update the head to the new node
            head = newNode;
        }
    }

    public void addLast(int data) {

        // Step 1: Creating a new node:
        Node newNode = new Node(data);// --> Constructor Called
        size++;

        if (head == null) {// --> If the linked list is empty
            head = tail = newNode;
        } else {
            // Step 2: Link the new node to the current head
            tail.next = newNode;

            // Step 3: Update the head to the new node
            tail = newNode;
        }
    }

    public static void printLL() {// O(n)
        if (head == null) {
            System.out.println("The LL is Empty");
            return;
        }
        Node temp = head;// For Any Operation On LL take a temp Node whose value is head
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);// coz in addFirst its is IMP to create a new Node(both head & tail value Changes) & it make sense.
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        //i = index-1; temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        int val = head.data;
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;// Returning an Invalid/Undefined value.
        }
        if (size == 1) {
            head = tail = null;
            size--;
        }
        head = head.next;// Shifting head to next to head so it gets removed.
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;//Any Invalid Value.
        }
        if (size == 1) {
            head = tail = null;
            size--;
        }
        //prev : idx = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;// tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {// O(n)
        Node temp = head;// Creating a new Node & Assigning a head to It.
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {//key Found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //Key Not Found:

        return -1;
    }

    public static int helper(Node head, int key) {// Helper func. for Recursion
        if (head == null) {
            return -1;// N0t Found
        }
        if (head.data == key) {
            return 0;// Found
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static int recSearch(int key) {
        return helper(head, key);
    }

    // Reverse Linked List:
    public static void reverse() {// O(n)
        Node prev = null;
        Node curr = tail = head;// Coz we are reversing Ll hence tail <-- head & Vice-Verse
        Node next;// Always initialized in Loop

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void RemoveEndidxLL(int n) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        temp = head; // Reset temp to the head.
        if (n == size) {
            head = head.next; // Remove the first node
            return;
        }

        int i = 0;
        int idx = size - n; // idx == index to find
        Node prev = head;
        while (i < idx - 1) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next; // Remove the nth node
    }

    public static Node findMid(Node head) {// By Slow-Fast technique
        Node slow = head;// +1
        Node fast = head;// +2

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow; // Returning the mid node which is slow
    }

    //Check if LL is Palindrome:
    public static boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;// Empty or Single Element LL
        }
        //Step 1: Find Mid
        Node newNode = findMid(head);

        //Step 2: reverse 2nd Half
        Node prev = null;
        Node curr = newNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;// Reversal Step
            prev = curr;
            curr = next;
        }
        Node right = prev; //Right Half Head
        Node left = head; //Left Half Head

        //Step 3: Comparing left and right Half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle Found.
            }
        }
        return false;
    }
    //MERGE SORT:
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) { // Change || to &&
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }


    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);  // -1 --> Dummy Node To Initialize
        Node temp = mergeLL;  // Points towards Head of merged LL

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;  // Deleting the Dummy Node --> -1
    }

    // Merge Sort in LinkedList:
    public Node MergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Find Mid
        Node mid = getMid(head);
        Node righthead = mid.next;
        mid.next = null;
        // Left and Right MS
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(righthead);

        // Merge:
        return merge(newLeft, newRight);
    }


    public static void main(String[] args)
        {
            LinkedList ll = new LinkedList();
            // Adding elements to the linked list
            ll.printLL();
            ll.addFirst(1);//Time Complexity: O(1)
            ll.printLL();
            ll.addFirst(2);
            ll.printLL();
            ll.addFirst(3);
            ll.printLL();
            ll.addFirst(7);
            ll.printLL();
            ll.addFirst(19);
            ll.printLL();
            ll.addLast(90);
            ll.printLL();
            ll.addLast(23);
            ll.printLL();
            ll.add(3,10);
            ll.printLL();
            System.out.println(ll.size);//This is Constant time O(n),if not static or not declared at all, each time a loop is needed hence O(n)
            ll.removeFirst();
            ll.printLL();
            ll.removeLast();
            ll.printLL();

            head = ll.MergeSort(head);
            System.out.println("TheSorted LL: ");
            ll.printLL();

            System.out.println("Key Index: "+ ll.itrSearch(90));
            System.out.println("Key Found at: " + ll.recSearch(90));
            ll.reverse();
            ll.printLL();
            ll.RemoveEndidxLL(3);
            ll.printLL();
            System.out.println("Mid: " + findMid(head).data);// Mid of the LL
            System.out.println(checkPalindrome());
        }
    }
