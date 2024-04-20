import java.util.*;
import java.util.*;
public class practice9 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Integers: ");
        int E = 0;
        int O=0;
        for(int i=0;i<=5;i++) {
             i = sc.nextInt();
            if(i%2==0){
                E=E+i;
            }
            else{
                O=O+i;
            }

        }
        System.out.println("The Sum of Odd Integers: "+O);
        System.out.println("The Sum of Even Integers: "+E);


    }
}
