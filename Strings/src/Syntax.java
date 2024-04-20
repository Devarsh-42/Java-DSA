//EVERYTHING ABOUT STRING IN JAVA IS HERE:
import java.util.*;
//Except Replace: checkout some methods in Java which are used to replace characters.(In Java Folder)
public class Syntax {
    public static void PrintChar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+"\t");
        }
    }

    public static String Substring(String str3, int si, int ei){// si & ei will be Given
        String substring = "";
        for(int i=si; i<ei; i++){
            substring += str3.charAt(i);
        }
        return substring;
    }

    public static void main(String arg[]){
        //Character Initialization:
        char arr[] = {'a','b','c','d'};

        //String Initialization( Two Ways ):
        String str = "Devarsh Mehta";
        String str2 = new String("Mehta");
        System.out.println(str.indexOf("v"));// INDEX OF FUNCTION
        System.out.println(str+"\t"+str2);

        //Java Strings are IMMUTABLE: any changes done in the string will make a new String,-
        //-Original String will remain Unchanged.

        //Escape Characters:
        System.out.println("We are the \\so-called \"Vikings\" from the \'North\'");
            //Output: We are the \so-called "Vikings" from the 'North'
            //bcoz String has "", for "",'' and \ inside the string we use \"\" , \'\' , \\ respty.

        //Input String:
        Scanner sc = new Scanner(System.in);
        String name; String name2;
//        System.out.print("Enter Your Name: \n");
//        name = sc.next(); // String Input for only on e word( Doesn't work after space)
        System.out.print(" Enter your Full Name: ");
        name2 = sc.nextLine();// Takes Full Line as input
        System.out.println(name2);

        //Length of String:
        System.out.println("Length of String "+str+" is : "+str.length());//'()' bcoz String is a fun

        //Concatenation ( Adding stuff up ):
        String Firstname = "Devarsh"; String Lastname = "Mehta";
        String FUllname = Firstname + " " + Lastname;
        System.out.println(FUllname);

        //Character At Index [CharAT()]:
        System.out.println(str.charAt(2));
        PrintChar(str);

        //Equality of Strings: Check Out Interning Function.[str.intern()]
            String s1 = "Dam";
            String s2 = "Dam";
            String s3 = new String("Dam");
             //String s1 & s3 are equal but s1 & s3 are not:
            if(s1 == s3){
                System.out.println("Strings are not equal");
                //Bcoz 'new String()' creates a new String Daaa!!
            }
            //Soo to check the equality any strings we use 'equals':
            if(s1.equals(s3)){
                System.out.println("now the strings are equal");
            }
            else{
                System.out.println("No the are not!");
            }
        //Substring:
        String str3 = "HelloWorld";
        System.out.println(str3.substring(0,5));//Inbuilt
        System.out.println(Substring(str3,0,5));
    }
}