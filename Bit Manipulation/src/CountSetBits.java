import java.util.*;
public class CountSetBits {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        for(n = n; n>0; n=n>>1){
            if((n & 1) != 0){//Checked Our LSB
                count++;
            }
        }
        System.out.println("Number of set ( no. of 1 bits ) bits in the digit = "+count);
    }
}
