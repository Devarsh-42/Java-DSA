import java.util.ArrayList;
public class Syntax {
    static class Stack{//All Operation of Stack
        static ArrayList<Integer> list = new ArrayList<>();

        //Is Empty
        public static boolean isEmpty(){
            if(list.size() == 0){
                return true;
            }
            return false;
        }
        //PUSH
        public static void push(int data){
            list.add(data);
        }

        //POP
        public static int pop(){
            if(isEmpty()){
                System.out.println("The Stack Is Empty!");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }

        //PEEK
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Stack Is Empty!");
                return -1;
            }
            return list.get(list.size()-1);
        }

        //PRINT
        public static void print(){
            while(isEmpty() != true){ // While( isEmpty() != true )
                System.out.println(peek());
                pop();
            }
        }
        public static void OnlyPrintInverse(){
            for(int i = 0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
        }
        public static void OnlyPrint(){
            for(int i = list.size()-1; i>=0; i--){
                System.out.println(list.get(i));
            }
        }
    }
    public static void main(String[] arg){
         Stack s = new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
//       s.print(); --> Print while removing --> LIFO Fashion
         s.OnlyPrintInverse();
         s.OnlyPrint();
    }
}
