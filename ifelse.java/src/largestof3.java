import java.util.*;
public class largestof3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        //Else-if and Logical Way
        if(x>=y && x>=z){
            System.out.println("Largest Number is : " + x);
        }
        else if(y>=z){
            System.out.println("Largest Number is : " + y);
        }
        else{
            System.out.println("Largest Number is : " + z);
        }
    }
}
         //The Nested Loop Way:
//        if(x>y){
//            if(x>z){
//                System.out.println("the Largest is : " + x);
//            }
//            else{
//                System.out.println("the Largest is : " + z);
//            }
//        }
//        else{
//            if(y>z){
//                System.out.println("the Largest is : " + y);
//            }
//            else{
//                System.out.println("the Largest is : " + z);
//            }

//}
