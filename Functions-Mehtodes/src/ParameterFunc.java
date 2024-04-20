import java.util.*;
public class ParameterFunc {
   public static int sum(int a,int b){
       int sum = a+b;
       return sum;
   }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = sum(num1,num2); //THIS 'sum' Integer is different than the above used bcoz they--
        System.out.println("The sum = " + sum);//--used in different functions.(Scope)
    }
}
