import java.util.Scanner;
// Or you can Write: import java.util.*; --> It means Import everything(all class or Interfaces).
public class input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//Here sc is scanner object
        //Comment Out other parts if You want Input of Other Properly
        //For Single line string Input
        String input = sc.next();//Only Reads the value till Blank Space(Only one word)
        System.out.print("The Single Line Input is\t");
        System.out.println(input);

        //For Multi line string Input
        String name2 = sc.nextLine();
        System.out.print("The Multi Line Input is: ");
        System.out.println(name2);

        //For an Integer input
        int x = sc.nextInt();
        System.out.println(x);

        //For Float Value Input
        float f=sc.nextFloat();
        System.out.println(f);

        //For Boolean Input
        boolean b=sc.nextBoolean();
        System.out.println(b);

    }
}