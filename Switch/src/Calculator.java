import java.util.*;
public class Calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Operation From Following:");
        System.out.println("+\t-\t*\t/\t%");
        int op = sc.next().charAt(0);
        System.out.print("Enter x : ");
        float x = sc.nextFloat();
        System.out.print("Enter y : ");
        float y = sc.nextFloat();
        switch(op){
            case '+': System.out.println("Addition : " + (x+y));
                        break;
            case '-': System.out.println("Subtraction : " +(x-y));
                        break;
            case '*': System.out.println("Multiplication : " +(x*y));
                        break;
            case '/': System.out.println("Division : " +(x/y));
                        break;
            case '%': System.out.println("Remainder : " +(x%y));
                        break;
            default: System.out.println("Invalid Input");
        }
    }
}
