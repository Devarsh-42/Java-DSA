import java.util.Scanner;
public class PrintPrime {
    public static boolean prime(int n){
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                isPrime=false;
            }
        }
        return isPrime;
    }
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)==true){
                System.out.print(i+"\t");
            }
        }
    }
    public static void main(String arg[]){
        System.out.print("Enter the last number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeinrange(n);
    }
}
