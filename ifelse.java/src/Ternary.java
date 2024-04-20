import java.util.*;
public class Ternary {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Overall %: ");
        int marks = sc.nextInt();
        //Ternary Operator
        String type = (marks>33)?"Pass" : "Fail";
        System.out.println(type);

    }
}
