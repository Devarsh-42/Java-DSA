//All Info about Arrays:
import java.util.*;
public class Array {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //Ways to Declare Array:
        int rollNo[] = {201,202,203,204,205,206};
        int marks[] = new int[20];

        //Input In Arrays:
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        //Can Perform Functions with Array Elements:
        System.out.println("Total Percentage : "+(marks[0]+marks[1]+marks[2])/3+"%");

        //Arrays can also be updated:
        System.out.println("Physics Marks: "+marks[1]);
        marks[1]=marks[1]+5;
        System.out.println("New Phys marks: "+marks[1]);

        //Length of Array:
        System.out.println("The length of Array is: "+marks.length);//Syntax = ArrayName.length
    }
}
