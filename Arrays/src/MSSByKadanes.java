// MSS Method 3
// Time Complexity of this Method(Kadane's Method) = O(n)
// This method will not work if all elements are -ve,the MSS Output will be 0,not the least -ve value.
public class MSSByKadanes {
    public static void Kadanes(int num[]){
        int MS = Integer.MIN_VALUE; //MS = Maximum Sum == -ve infinity
        int CS = 0; //CS = Current Sum

        for(int i=0; i<num.length; i++){
            CS = CS+ num[i];
            if(CS<0){
                CS = 0;
            }
            MS = Math.max(CS,MS); // Maximum of MS & CS will be Stored in MS
            //OR can USE else if condition as below:
//            else if (CS>MS) {
//                MS = CS;
//            }
        }
        System.out.println("Maximum Sum : "+MS);

    }
    public static void main(String arg[]){
        int num[] = {2,4,6,8,10};
        int num2[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(num2);
    }
}
