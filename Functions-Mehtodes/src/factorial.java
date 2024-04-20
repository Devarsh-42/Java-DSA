import java.util.*;
public class factorial {
    public static int factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact=fact*i;
        }
//        System.out.println(x+"! = "+fact);  OR
        return fact;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  x = ");
        int x = sc.nextInt();
        System.out.println(x+"! = "+factorial(x));
    }
}
