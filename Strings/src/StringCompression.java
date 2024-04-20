//VERY FAMOUS QUES: Compress the given string by writing no. of occurrence after that char
//eg: 'aaabbccccdd' to 'a3b2c4d2'

public class StringCompression {
    public static String Compress2(String str){//Genl Method METHODE
        String str2 = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;// DO NOT USE int toString() will not work
          while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
              count++;
              i++;
          }
          str2 += str.charAt(i);
          if(count>1){
              str2 += count.toString();
            }
        }
        return str2;
    }
    public static String Compress1(String str){// MY FIRST ATTEMPT METHOD
        StringBuilder sb = new StringBuilder("");
        int x=1;//Count
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == str.charAt(i-1)){
                x++;
            }else{
                if(x>1) {
                    sb.append(x);
                }
                sb.append(str.charAt(i));
                x=1;
            }
        }if(x>1) {
            sb.append(x);
        }
        return sb.toString();
    }
    public static void main(String arg[]){
        String str = "aaabbccccddeff";
        System.out.println(Compress1(str));
        System.out.println(Compress2(str));
    }
}
