import java.util.Scanner;

public class Fibonacci {
        static int fib(int n) {
            if (n <= 0) {
                System.out.println("Invalid input. n must be a positive integer.");
                return 0;
            } else if (n == 1) {
                return 0;
            } else if (n == 2) {
                return 1;
            } else {
                return fib(n - 1) + fib(n - 2);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(fib(i)+"\t");
            }
        }
}
