import java.sql.SQLOutput;
import java.util.*;
public class LargestNumber {
    public static int Smallest(int numbers[]){
        int Smallest = Integer.MAX_VALUE;// +ve or +Infinity(MAx Possible Int value)
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<Smallest){
                Smallest = numbers[i];
            }
        }
        return Smallest;
    }
    public static int Largest(int numbers[]){
        int Largest = Integer.MIN_VALUE;// -ve Infinity (Smallest Integer Possible)

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>Largest){
                Largest = numbers[i];
            }
        }
        return Largest;
    }
    public static void main(String arg[]){
        int numbers[] = {1,2,3,6,8,9,10,5,90,99,7};
        int Max = Largest(numbers);
        int Min = Smallest(numbers);
        System.out.println("Largest Number in Array is: "+Max+"\nThe Smallest Value is: "+Min);
        //OR
        System.out.println("The Largest array Element is: "+Largest(numbers)+"\nThe Smallest Value is: "+Smallest(numbers));

    }
}
