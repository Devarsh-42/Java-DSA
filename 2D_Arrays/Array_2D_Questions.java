//Questions from 2D Arrays
public class Array_2D_Questions {
    public static void Occurence(int matrix[][]) {
        int Sevens = 0;

        for(int n = 0; n < matrix.length; n++){
            for(int m = 0; m < matrix[0].length; m++){
                if(7 == matrix[n][m]){
                    Sevens++;
                }
            }
        }
        System.out.println("The number of 7's in the matrix are: "+Sevens);
    }
    public static void SUMofROWs(int matrix[][]){
        int sum  = 0;
        for(int m = 0; m < matrix[0].length; m++){
            sum = sum + matrix[1][m];
        }
        System.out.println("Sum of 2nd row = "+sum);
    }
    public static void Transpose(int matrix[][]){
            int row = matrix.length;
            int col = matrix[0].length;
            //Initial matrix:
            for(row = 0; row<matrix.length; row++){
                for(col = 0; col<matrix[0].length; col++){
                    System.out.print(matrix[row][col]+"\t");
                }
                System.out.println();
            }
            //Transpose matrix:
            //Also there are other ways
            System.out.println("Transpose of the matrix: ");
            for(col = 0; col<matrix[0].length; col++){
                for(row = 0; row<matrix.length; row++){
                    System.out.print(matrix[row][col] + "\t");
                }
                System.out.println();
            }

    }
    public static void main(String arg[]) {
        int matrix[][] = {{7, 20, 30, 40},
                {7, 25, 35, 45},
                {27, 10, 7, 47},
                {32, 33, 39, 7}};
        Occurence(matrix);
        SUMofROWs(matrix);
        Transpose(matrix);
    }
}