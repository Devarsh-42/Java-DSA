public class Removing_Duplicates_in_Strings {
    public static void main(String arg[]){
        String str = "appnnacollege";
        RemoveDuplicates(str, 0, new StringBuilder(),new boolean[26]);
    }

    public static StringBuilder RemoveDuplicates(String str,int idx, StringBuilder newstr,boolean map[]){
        if(idx == str.length()){// BAse Case
            System.out.println(newstr);
            return newstr;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            return RemoveDuplicates(str, idx+1, newstr,map);
        }
        else{
            map[currChar  - 'a'] = true;
            return RemoveDuplicates(str,idx+1, newstr.append(currChar), map);
        }

    }
}
