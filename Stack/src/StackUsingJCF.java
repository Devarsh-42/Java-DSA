//stack Using the "JCF"!!
// Question : Push The Element at Bottom of the STack --> Amazon PYQ
import java.util.*;
public class StackUsingJCF {
    public static void ReverseStack(Stack<Integer> s){//Using Extra Memory!!
        ArrayList<Integer> list = new ArrayList<>();
        while (!s.isEmpty()) {
            list.add(s.pop());
        }
        for(int i = 0; i < list.size(); i++){
            s.push(list.get(i));
        }
    }
    public static void Reverse(Stack<Integer> s){
        if(!s.isEmpty()){
            return;
        }
        int top = s.pop();
        Reverse(s);
        PushAtBottom(s,top);
    }
    public static void PushAtBottom(Stack<Integer> s, int x){//Using Recursion
        //Can be executed using multiple Ways, Making & storing in a new ArrayList or LL
        //But in this We no No Extra Space and have Linear TC(O(n))
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top = s.peek();
        s.pop();
        PushAtBottom(s,x);
        s.push(top);
    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] arg){
        // BEST FREAKING WAY!
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        s.push(3);
        s.push(4);
        s.push(7);
        print(s);
        s.push(3);
        s.push(4);
        s.push(7);
        System.out.println("Enter the Element top be pushed at bottom: ");
        int x = sc.nextInt();

        PushAtBottom(s, x);

//        print(s);
//        s.push(3);
//        s.push(4);
//        s.push(7);
//
//        System.out.println("The Reversed Stack: ");
//        ReverseStack(s);
//        print(s);

        s.push(7);
        s.push(4);
        s.push(3);

        System.out.println("Reverse Using Recursion: ");
        Reverse(s);
        print(s);
    }
}
