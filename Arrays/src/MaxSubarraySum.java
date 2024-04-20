//MSS Method 1
//Maximum SubArray Sum == MSS
// By this[Brute Force] method Time Complexity : O(n^3)
public class MaxSubarraySum {
    public static void MaxSumSubArrays(int num[]){
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            for(int j=i; j<num.length;j++){
                CurrentSum =0;
                for(int k = i; k <= j ;k++){
                    CurrentSum = CurrentSum + num[k];
                }
                System.out.println(CurrentSum);
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
