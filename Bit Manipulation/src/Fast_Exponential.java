import java.util.*;
public class Fast_Exponential {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int a = sc.nextInt();
        int A = a;
        System.out.print("Enter The Power: ");
        int n = sc.nextInt();
        int N = n;
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){// Checking LSB, here to ensure that we can multiply the power
                ans  = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        System.out.println("The Value of "+A+"^"+N+" = "+ans);
    }
}
