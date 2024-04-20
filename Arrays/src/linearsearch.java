import java.util.*;
public class linearsearch {
    public static void main(String arg[]){
        int i=0;
        Scanner sc = new Scanner(System.in);
        boolean found = true;
        int numbers[] = {1,2,3,4,99,67,69,31,34,889};
        System.out.print(numbers + "\nEnter Number from above array: ");
        int Result = sc.nextInt();
        //Don't use i<=numbers bcoz it will show an error that u tried to access till index 10 but array-
        //-has inerx form 0 to 9.So your Java program is trying to access an element in an array that doesn't exist.
        for(i=0;i<numbers.length;i++){
            if(numbers[i]==Result){
                found = true;
                break;
            }
            else{
                found = false;
            }
        }
        if(found==true){
            System.out.println("The element "+Result+" Is at index no "+i+" of array");
        }else{
            System.out.println("The Input Element is not found");
        }


    }
}
