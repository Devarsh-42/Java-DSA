//Practice Questions of Bit Manipulation
import java.util.*;
public class BitManipulation_Questions {
    //Q1:
    public static int Power(int x){
        int X = x;
        int X1 = x;
        int ans = 1;
        while(X > 0){//Remember Power , here X is in binary
            if((X & 1) != 0){// Checking LSB, here to ensure that we can multiply the power
                ans  = ans * x;
            }
            x = x * x;
            X = X>>1;
        }
        System.out.println("The Value of "+X1+"^"+X1+" = "+ans);
        return ans;
    }
    //Tool:
    public static int SetIthBit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    //Tool:
    public static int ClearBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    //Q2:
    //Wrong Method:
//    public static void SwapM1(int n1, int n2){
//        for(int i = 1; i<Math.max(Math.log(n1)+1 , Math.log(n2)+1); i++) {
//            if (((n1 >> i) & 1) != ((n2 >> i) & 1)) {//Checking LSB
//                if (((n1 & (i << 1)) == 0)){
//                    //Swapping the Bits:
//                    n1 = SetIthBit(n1, i);
//                    n2 = ClearBit(n2, i);
//                } else if (((n2  & (1<<i)) == 0)) {
//                    //Swapping the Bits:
//                    n2 = SetIthBit(n2, i);
//                    n1 = ClearBit(n1, i);
//                }
//            }
//        }
//        System.out.println("After Swap by M1: n1:"+n1+" & n2:"+n2);
//    }
    //Correct Method:
    public static void SwapM2(int n1 , int n2){// Main XOR Method
        for(int i=0;i<(Math.max((int)Math.log(n1+1)/Math.log(2),(int)Math.log(n2+1)/Math.log(2)));i++){
            if(((n1 >> i) & 1) != ((n2 >> i) & 1)){//Checking LSB
                n1 = n1 ^ (1 << i);//Flipping ith bit of n1
                n2 = n2 ^ (1 << i);//Flipping ith bit of n2
            }
        }
        System.out.println("After Swap by M2: n1:"+n1+" & n2:"+n2);
    }
    //Q3:
    public static int AddOneM1(int x){
        if(x%2 == 0){//If no. is even its binary always have 0 in the end
            x = x | (1<<0);
        }
        else{
            for(int i=0; i<=31; i++){// he correct condition should be i <= 31
                // (assuming int is 32 bits) to iterate over all the possible bit positions.
                // also do not use:  i<=((int)Math.log(x+1)/Math.log(2))
                if( (x & (1<< i) ) != 0){//Checking LSB
                    x = x & ~(1<<i);//Clearing bit when there is 1
                }else if( (x & (1<<i) ) == 0){
                    x = x | (1<<i);//Setting Bit when there is 0
                    break;
                }
            }
        }
        return x;
    }
    public static int AddOneM2(int x){
        return -(~x);// Almost the same effort as my code!!
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        //Q4: Upper Case to Lower Case using Bits:
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch | ' ');
        }
        System.out.print("Enter The Number: ");
        int x = sc.nextInt();
        Power(x); // Q1
        System.out.println(x+" + 1 = "+AddOneM1(x));
        System.out.println(x+" + 1 = "+AddOneM2(x));
//        System.out.print("Enter n1: "); //Q2
//        int n1 = sc.nextInt();
//        System.out.print("Enter n2: ");//Q2
//        int n2 = sc.nextInt();
////      SwapM1(n1,n2); --> Wrong Method --> Print (4,7) for (n1,n2) == (5,6)
//        SwapM2(n1,n2);//Q3  // uses XOR to flip the bits
    }

}
