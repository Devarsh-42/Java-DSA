import java.util.*;
public class While {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        int count = 1;
        while(count<=n){
            System.out.println(count);
            count++;
        }
    }
}
