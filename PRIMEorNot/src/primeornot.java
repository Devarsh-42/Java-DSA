import java.util.*;
public class primeornot {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        boolean isPrime = true;//To Store the Outcome
        for(int i=2; i<=Math.sqrt(n); i++)//Math.sqrt(n)= Square root of n
            // Can use i<=(n-1) but this consumes more time
        {
            if(n % i == 0)
            {
                isPrime = false;
            }

        }
        if(isPrime==true){
            System.out.println(n + " is a Prime number");
        } else{
            System.out.println(n + " is Not a prime number");
        }
    }
}
