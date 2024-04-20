import java.util.*;
public class oddeven {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%2==0) {
            System.out.println(x + " is Even ");
        }
        else {
            System.out.println(x + " is Odd ");
        }
    }

}