import java.util.*;
public class FriendsPairing {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of friends n : ");
        int n = sc.nextInt();
        System.out.print(PossibleParing(n));
    }
    public static int PossibleParing(int n){
        if(n == 1 || n==2){// BAse Case
            return n;
        }
        //Single Choice:
         int Single = PossibleParing(n-1);

        //Pairing Choice:
        int Paired = (n-1) * PossibleParing(n-2);

        return Single + Paired;

        //return PossibleParing(n-1) + (n-1)*PossibleParing(n-2); --> Optimized Way
    }
}
