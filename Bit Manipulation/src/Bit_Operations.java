import java.util.*;
public class Bit_Operations {
    // Get the bit at ith position of the number:
    public static int BitNumber(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    //Set the bit(make it 1) at ith position:
    public static int SetIthBit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    //Clear the bit(make it 0) at ith position:
    public static int ClearBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    //Update( Set(to 1) or Clear(to 0)) the bit at ith position:
    public static int UpdateIthBit(int n,int i, int newbit){
        //Simplest Method:
//       if(newbit == 0){
//           return ClearBit(n,i);
//       }else{
//           return SetIthBit(n,i);// ith bit is being set(converted to 1)if newbit == 1
//       }
       // Another Way:
        n = ClearBit(n,i);
        int bitmask = newbit<<i;// ith bit is being set(converted to 1) if newbit == 1
        return n | bitmask;
    }
    public static int ClearLastIBits(int n, int i){
        int bitmask = ~0<<i;// -1<<i  == 111111 --> 111100 if i=2
        return n & bitmask;
    }
    //As the name Suggests
    public static int ClearInRange(int n, int si,int ei){
        int a = 1<<(ei+1);
        int b = (1<<si)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static boolean isPowOftwo(int n){
        // PROPERTY: if(n is pow of 2 then ==> n & (n-1) = 0)
        // eg: 4=100 , 3=011 hence 100 & 011 = 0
        return (n & (n-1)) == 0; // This means that if n&(n-1) = 0 the return true Else returns false
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter ith bit number:");
        int i = sc.nextInt();
        System.out.print("Enter the value of newbit(0 or 1): ");//For Update
        int newbit = sc.nextInt();
        System.out.println("Enter Starting Index & Ending index to clear bit b/w them: ");
        int si = sc.nextInt();
        int ei = sc.nextInt();
        System.out.println("The bit at ith position = "+BitNumber(n,i));
        System.out.println("Number when ith bit is set = "+SetIthBit(n,i));
        System.out.println("Number after clearing Bit i = "+ClearBit(n,i));
        System.out.println("Number after Updating bit at i = "+UpdateIthBit(n,i,newbit));
        System.out.println("The Number after clearing last i bits = "+ClearLastIBits(n,i));
        System.out.println("The Number after clearing bits in range = "+ClearInRange(n,si,ei));
        System.out.println("The number "+n+" is power of 2(True /false): "+isPowOftwo(n));
    }
}
