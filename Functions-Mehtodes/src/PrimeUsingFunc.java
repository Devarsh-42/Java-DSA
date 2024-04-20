import java.util.*;
public class PrimeUsingFunc {
    public static boolean prime(int n){
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        return isPrime;
    }
    public static void main(String arg[]){
        System.out.print("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            prime(n);
    }
}
