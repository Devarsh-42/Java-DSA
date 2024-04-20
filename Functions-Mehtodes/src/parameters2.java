import java.util.*;
public class parameters2 {
    public static int product(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int mult = product(num1 , num2);
        System.out.println("The product of "+num1+" & "+num2+" = "+mult);
        int mult2 = product(num3,num4);
        System.out.println("The product of "+num3+" & "+num4+" = "+mult2);
    }
}
