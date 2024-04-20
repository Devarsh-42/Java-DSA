import java.util.*;
public class Problem1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        System.out.println("Enter the real part of 1st number: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the Imaginary part of 1st number: ");
        int i1 = sc.nextInt();
        System.out.println("Enter the real part of 2nd number: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the Imaginary part of 3rd number: ");
        int i2 = sc.nextInt();
        System.out.println("The Sum of two numbers: "+c1.Sum(r1,r2,i1,i2));
        System.out.println("The Difference of two numbers: "+c1.Difference(r1,r2,i1,i2));
        System.out.println("The Product of two numbers: "+c1.Product(r1,r2,i1,i2));
    }
}
 class Complex{
    String Sum(int r1,int r2, int i1, int i2){
        int r3 = r1 + r2;
        int i3 = i1 + i2;
        String ComplexSum = r3 + " i" + i3;
        return ComplexSum;
    }
     String Difference(int r1,int r2, int i1, int i2) {
         int r3 = r1 - r2;
         int i3 = i1 - i2;
         String ComplexDifference = r3 + " i" + i3;
         return ComplexDifference;
     }
     String Product(int r1,int r2, int i1, int i2){
         int r3 = (r1*r2)-(i1*i2);
         int i3 = (r2*i1) + (r1*i2);
         String ComplexProduct = r3 + " i" + i3;
         return ComplexProduct;
     }
}