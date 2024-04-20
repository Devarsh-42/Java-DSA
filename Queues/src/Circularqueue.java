public class Circularqueue {
    static class Queue {
        int[] arr;
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("The Queue is Full");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("The Queue is Empty");
                return -1;
            }
            int frontData = arr[front];
            if (front == rear) {
                front = rear = -1; // Reset the queue
            } else {
                front = (front + 1) % size;
            }
            return frontData;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("The Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        public void print() {
            int i = front;
            while (i != rear) {
                System.out.print(arr[i] + "-->");
                i = (i + 1) % size;
            }
            System.out.println(arr[rear]);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.print();
        q.enqueue(26);
        q.print();
        q.enqueue(30);
    }
}
