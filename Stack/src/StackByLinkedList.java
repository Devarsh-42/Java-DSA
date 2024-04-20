import java.util.*;

public class StackByLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{//All Operation of Stack Using LinkedList
        static Node head = null;
        static int size;

        //IsEmpty
        public static boolean isEmpty(){
            return head == null;
        }

        //Push
        public static void push(int data){
            Node newNode = new Node(data);
            size++;
            if(isEmpty()){//Stack is Empty
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //POP
        public static int pop(){
            if(isEmpty()){
                System.out.println("The LL is Empty!");
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        //PEEK
        public static int peek(){
            if(isEmpty()){
                System.out.println("The LL is Empty!");
                return -1;
            }
            return head.data;
        }

        //PRINT
        public static void print(){
            while (!isEmpty()){
                System.out.println(peek());
                pop();
            }
        }
        public static void OnlyPrint(){
            Node temp = head;// For Any Operation On LL take a temp Node whose value is head
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] arg){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //s.print(); //--> Print while removing --> LIFO Fashion
        s.push(9);
        s.OnlyPrint();



    }
}
