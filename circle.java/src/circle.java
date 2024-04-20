import java.util.*;
public class circle {
    public static void main(String[] args)
    {
        //Finding Are & Perimeter of Circle
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        float perimeter = 2*3.14f*rad;
        System.out.println(area);
        System.out.println(perimeter);


    }
}