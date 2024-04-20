public class ArrayReverse {
    public static void Reverse(int num[]){
        //By this method time complexity : O(n/2)  where n = no. of elements in array
        int start = 0, end = num.length-1;
        while(start<end){
            //Swap of array:
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String arg[]){
        int num[]={1,2,3,4,5,6,7,8,9,10};
        Reverse(num);
        for(int i=0;i<=num.length-1;i++) {
            System.out.print(num[i]+ "\t");
        }
    }
}
