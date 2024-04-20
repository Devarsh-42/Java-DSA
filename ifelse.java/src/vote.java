import java.util.*;
public class vote {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18) {
            System.out.println("Eligible to vote");
        }
        if(age>13 && age<=18){
            System.out.println("Teenager");
        }
        else {
            System.out.println("Do not vote!!");
        }
    }

}
