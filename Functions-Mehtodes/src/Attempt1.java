//By My Method of Division & then rev whis is the binary ans
//BUT Don't Use this Method
import java.util.*;
public class Attempt1 {
    public static int DecToBin(int Dec){
        int DecNo=Dec;
        int rem=0;
        int rev=0;
        int BinNo=0;
        int Bin=0;
        while(Dec>0){
            rem=Dec%2;
            Bin=Bin*10+rem;
            Dec=Dec/2;

        }
        while(Bin>0){
            rev=Bin%10;
            BinNo=BinNo*10+rev;
            Bin=Bin/10;
        }
        System.out.println("The Binary Number of "+DecNo+" is : "+BinNo);
        return BinNo;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Digit: ");
        int Dec = sc.nextInt();
        DecToBin(Dec);
    }
}
