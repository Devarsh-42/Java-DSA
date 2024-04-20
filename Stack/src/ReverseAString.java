import java.util.*;
public class ReverseAString {
    public static void main(String[] arg){
        Stack<Character> s = new Stack<>();

        Scanner sc = new Scanner(System.in);
        String str1;
        StringBuilder str2 = new StringBuilder();

        //String Input:
        System.out.println("Enter The String: ");
        str1 = sc.next();

        for(int i = 0; i < str1.length(); i++){
            s.push(str1.charAt(i));
        }

        while (!s.isEmpty()){
            str2.append(s.pop());// Used StringBuilder instead to string because makes more sense
        }
        System.out.println("The Reversed String: " + str2);
    }
}
