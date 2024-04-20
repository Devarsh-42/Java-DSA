import java.util.*;
public class Average {
    public static int Average(int x,int y,int z) {
        int avg = x+y+z;
        System.out.println("The Average of "+x+","+y+" & "+z+" = "+avg );
        return avg;
    }
    public static int sum(int x){
        int num = x;
        int add = 0;
        while(x>0){
            int i=x%10;
            add = add + i;
            x=x/10;
        }
        System.out.println("The sum of digits of "+num+" = "+add);
        return add;
    }
    public static boolean isEven(int x){
        boolean even = false;
        if(x%2==0){
            even = true;
            System.out.println(x+" is even");
        }
        else{
            System.out.println(x+" is odd");
        }
        return even;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        sum(x);
    }
}


