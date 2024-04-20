public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public DoublyLL() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    //Remove
    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;//Invalid value returned
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    // Remove from the list (you can implement this as needed)
    // For example, you can implement a method to remove a node by its value or index.

    // Print the doubly linked list
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addFirst(9);
        dll.addFirst(17);
        dll.addFirst(29);
        dll.printLL();
        dll.removeFirst();
        dll.printLL();
    }
}
