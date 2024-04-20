//Check weather Input string is palindrome or not
import java.util.*;
public class StringPalindrome {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        char rev;String reverse;
        int pal = 0;
        int l = str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) == str.charAt(l-i-1)){
                pal++;
                continue;
            }
            else{
                System.out.println(str +" is not Palindrome");
                break;
            }
        }
        if(pal != 0){
            System.out.println(str+" is palindrome");
        }
    }
}
