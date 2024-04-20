class Solution {
    public static void main(String arg[]){
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int a,rev=0;

        if(x<0){
            return false;
        }
        while(x>0){
            a=x%10;
            rev=rev*10+a;
            x /= 10;
        }

        if(x == rev){
            System.out.println(rev);
            return true;
        }
        else{
            System.out.println(rev);
            return false;
        }

    }
}