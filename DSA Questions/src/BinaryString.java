import java.util.Scanner;
public class BinaryString {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of string : ");
        int n = sc.nextInt();
        ValidString(n,0,new String(""));// LP:0 so that u can start with anything
    }
    public static void ValidString(int n, int lastplace, String str){
        if(n == 0){//BAse Case
            System.out.println(str);
            return;
        }
        ValidString(n-1,0,str + "0");// To be done Each time
        if(lastplace == 0){
            ValidString(n-1,1,str + "1");// Only if lp is 0
        }
    }
}
