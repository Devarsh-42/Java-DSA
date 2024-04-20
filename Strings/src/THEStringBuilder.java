public class THEStringBuilder {
    public static void main(String arg[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch < 'z'; ch++){
            sb.append(ch);//if it were normal string then it would have hugee time complx.
        }
        System.out.println(sb);//O(26) bcoz loop runs 26 times linearly
        //In normal string Time complexity would be: O(26*(n)^2)
        System.out.println(sb.length());
    }
}
