import java.util.*;
public class printrev {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit: ");
        int n = sc.nextInt();
        System.out.print("The reverse of the Digit : ");
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            System.out.print(r);
        }
    }
}
