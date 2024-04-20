public class Odd_Even {
    public static void EvenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println(n+" is odd");
        }else{
            System.out.println(n+" is even");
        }
    }
    public static void main(String arg[]){
        EvenOrOdd(3);
        EvenOrOdd(12);
        EvenOrOdd(19);
        EvenOrOdd(98);
    }
}
