public class DiagonalSum {
    public static int  Sum(int matrix[][]){
        int sum = 0;
        //BRUTE FORCE APPROACH: Time Complexity : O(n^2)
//        for(int i=0; i<matrix.length;i++){
//            for(int j=0; j<matrix[0].length;j++){
//                if(i == j){
//                    sum += matrix[i][j];
//                }// For the cases in which odd number of matrixOrder: Center elem will overlap
//                 else if(i+j == matrix.length-1){
//                    sum += matrix[i][j];
//                }
//            }
//        }
        //Optimized Approach: Time Complexity: O(n)
        for(int i=0; i<matrix.length; i++){
            //Primary Diagonal:
            sum += matrix[i][i];
            //Secondary Diagonal:
            if(i != matrix.length-1-i) {//For cases in which odd MatrixOrder:Center elem will overlap
                sum += matrix[i][matrix.length - 1 - i];
                //if i+j = n - 1
                //then j = n-1-i where n= length of matrix
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String arg[]){
        int matrix[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        Sum(matrix);
    }
}
