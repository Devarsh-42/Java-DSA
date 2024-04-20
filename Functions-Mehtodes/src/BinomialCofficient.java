import java.util.*;
public class BinomialCofficient {
    public static int factorial(int x){
        int f = 1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
    }
    public static double Binomial(int n,int r){
        int BC = factorial(n)/(factorial(r)*factorial(n-r));
        return BC;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter r = ");
        int r = sc.nextInt();
        System.out.println(n+" C "+r+" = "+Binomial(n,r));

    }
}
