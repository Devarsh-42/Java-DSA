public class Queues {

    static class Queue{
        int[] arr;// Size of Array/ Queue
        int size;
        int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public  boolean isEmpty(){
            return rear == -1;
        }
        public boolean isFull(){
            return rear == size-1;
        }

        //Enqueue
        public void enqueue(int data){
            if(isFull()){
                System.out.println("The Queue is Full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        //Dequeue
        public int dequeue(){
            if(isEmpty()){
                System.out.println("The Queue is Full");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];//Shifting each element to its previous position
            }
            return front;
        }
        //Peek
        public int peek(){
            if(isEmpty()){
                System.out.println("The Queue is Full");
                return -1;
            }
            return arr[0];
        }
        //Print
        public void print(){
            for(int i = 0; i<rear; i++){
                System.out.print(arr[i] + "-->");
                dequeue();
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(25);
        q.print();
        q.enqueue(26);
        q.print();
    }
}
