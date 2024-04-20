public class PairsInArray {
    public static int Pairs(int num[], int TP){
        //Pairs by nested loop:
        for(int i=0; i<num.length;i++){
            //int temp = num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
                TP++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+TP);
        return TP;
    }
    public static void main(String arg[]) {
        int num[] = {1, 3, 5, 7, 9, 11, 13};
        int TP = 0;//Total Pairs = [n*(n-1)]/2 , n = number of elements in array

        Pairs(num, TP);
        //TIME COMPLEXITY of this code : O(n^2)

    }
}
