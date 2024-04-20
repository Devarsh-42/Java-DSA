import java.util.*;
public class largest {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>y) {
            System.out.println("Largest : " + x);
        }
        else {
            System.out.println("Largest : " + y);
        }
    }

}
