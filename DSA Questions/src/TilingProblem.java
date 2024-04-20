//The Size of floor is 2*n and size of tile is 2*1, So find no. of ways in which you can arrange the-
//-tiles. n should be any input from us
import java.util.*;
public class TilingProblem {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of floor n: ");
        int n = sc.nextInt();
        System.out.println(Ways(n));
    }
    public static int Ways(int n){
        if(n == 0 || n == 1){//Base Case
            return 1;
        }
        //Vertical:
        int vertical = Ways(n-1);//When placed vertically -> 1 place is filled & n-1 remaining

        //Horizontal:
        int Horizontal = Ways(n-2);//When placed horizontally -> 2 place is filled & n-2 remaining

        return vertical + Horizontal;
//       return Ways(n-1) + Ways(n-2);  -->  Direct Method
    }
}
