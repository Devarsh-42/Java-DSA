//MSS Method 2
// By this[Prefix Array] method Time Complexity : O(n^2)
public class MSSByPrefixArray {
    public static void MaxSumSubArrays(int num[]){
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        //Calculate Prefix Array:
        prefix[0] = num[0];
        for(int i=1; i<num.length; i++){
            prefix[i] = prefix[i-1] + num[i];

        }


        for(int i=0; i<num.length;i++){
            int start = i;
            for(int j=i; j<num.length;j++){
                int end = j;
                // By Ternary op: CurrentSum = start == 0 ? prefix(end) : prefix(end)-prefix(start-1)
                if(start==0) {
                    CurrentSum = prefix[end];
                }
                else{
                CurrentSum = prefix[end] - prefix[start-1];
                }

                if(CurrentSum>MaxSum){
                    MaxSum = CurrentSum;
                }
            }
        }
        System.out.println("max subarray sum : " + MaxSum);
    }
    public static void main(String arg[]){
        int num[] = {2,4,6,8,10};
        int num2[] = {1,-2,6,-1,3};
        MaxSumSubArrays(num);
        MaxSumSubArrays(num2);
    }
}
