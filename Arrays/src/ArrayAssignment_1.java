import java.util.*;
public class ArrayAssignment_1 {
    public static boolean RepeatCheck(int nums[]){
        for(int i = 0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                System.out.println(nums[i]+","+nums[j]);
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String arg[]){
        int nums[] = {1,2,3,4,5,6,7};
        System.out.println(RepeatCheck(nums));
    }
}
