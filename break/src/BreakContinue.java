import java.util.*;
public class BreakContinue {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the Number: ");
            int num = sc.nextInt();
            if (num % 10== 0){
                //System.out.println("Invalid.");
                continue;//Bor Break th loop use Break, Daaa!!
        }
            else{
                System.out.println(num);
            }

        }
    }
}
