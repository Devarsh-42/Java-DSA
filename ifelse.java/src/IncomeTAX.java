import java.sql.SQLOutput;
import java.util.*;
public class IncomeTAX {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your CTC(in Rs.) : ");
        int ctc = sc.nextInt();
        if(ctc<700000){
            System.out.println("Your In Hand Salary is: " + ctc);
            System.out.println("Your tax paid : " + 0);
        }
        else if (ctc>700000 && ctc<1000000 ) {
            System.out.println("Your In Hand Salary is: " + (ctc-0.2*ctc));
            System.out.println("Your tax paid : " + ctc*0.2);
        }
        else{
            System.out.println("Your In Hand Salary is: " + (ctc-0.3*ctc));
            System.out.println("Your tax paid : " + ctc*0.3);
        }
    }
}
