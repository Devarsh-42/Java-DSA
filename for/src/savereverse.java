import java.util.Scanner;

public class savereverse {
        public static void main(String arg[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Digit: ");
            int n = sc.nextInt();
            int reverse =0;

            while (n > 0) {
                int r = n % 10;
                reverse = reverse*10 + r;
                n = n / 10;
            }
            System.out.print("The reverse of the Digit : " + reverse );
        }
    }

