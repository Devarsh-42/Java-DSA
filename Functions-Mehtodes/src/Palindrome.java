import java.util.*;
public class Palindrome {
    public static void palindrome(int x){
        int num=x;
        int rev=0;
        while(x!=0){
            int i=x%10;
            rev=rev*10+i;
            x=x/10;
        }

        if(rev==num){
            System.out.println("The number "+num+" is Palindrome");
        }
        else{
            System.out.println("The number "+num+" is not Palindrome");
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        palindrome(x);
    }
}
//                                          BY FOR LOOP:
//import java.util.Scanner;
//
//public class PalindromeCheck {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//
//        // Store the original number in a separate variable
//        int originalNumber = number;
//
//        int reverseNumber = 0;
//        for (int i = number; i != 0; i /= 10) {
//            int remainder = i % 10;
//            reverseNumber = reverseNumber * 10 + remainder;
//        }
//
//        if (originalNumber == reverseNumber) {
//            System.out.println(originalNumber + " is a palindrome number.");
//        } else {
//            System.out.println(originalNumber + " is not a palindrome number.");
//        }
//    }
//}
//
