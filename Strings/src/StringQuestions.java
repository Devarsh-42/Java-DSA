//Q1:Count how many times lower case vowels occurred in a String entered by the user.
//Q2: Determine if 2 Strings are 'anagrams' of each other.
import java.util.*;
public class StringQuestions {
    public static int LowerCaseVowels(String str1){
        int lv = 0;
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch == 'a' ||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u' ){
                lv++;
            }
        }
        return lv;
    }
    public static void Anagrams(String str1,String str2){
        boolean isAnagrams = false;
        if(str1.length() == str2.length()) {
            for(int i=0; i<str1.length(); i++){
                for(int j=0; j<str2.length(); j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        isAnagrams = true;
                    }else{
                        isAnagrams = false;
                    }
                }
            }

        }else{
            isAnagrams = false;
        }
        if(isAnagrams == true){
            System.out.println("The Given two strings "+str1+" & "+str2+" are Anagrams.");
        }else{
            System.out.println("The Given two strings "+str1+" & "+str2+" are Not Anagrams.");
        }
    }
    public static void Anagrams2(String str1,String str2) {//Ques Sol Sheet Method:
        //first convert both str to lower case
        //then check weather string lengths are same or not if Condn
        //then convert both strings into char array:  char[] str1charArray = str1.toCharArray();
        //then sort the char array : Arrays.sort(str1charArray);
        // if the sorted char arrays are same or identical then the strings areanagram like this:
        //booleanresult=Arrays.equals(str1charArray,str2charArray);
        // if(result) {System.out.println(str1+" and "+str2+" are anagrams of eachother.");
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the String 2: ");
        String str2 = sc.nextLine();
        System.out.println(LowerCaseVowels(str1));//Q1
        Anagrams(str1,str2);


    }
}