//For a given string convert the first letter of each word to Uppercase
public class ConvertTOUppercase {
    public static String ToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();// Returning SubString sb as a String
    }
    public static void main(String arg[]){
        String str = "Hello, i am iron man";
        System.out.println(ToUpperCase(str));
    }
}
