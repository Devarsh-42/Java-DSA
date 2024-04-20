import java.util.*;
public class sumofn {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("the sum of first " + n + " Terms = " + sum);
    }
}
