import java.util.*;
public class Largest_Smallest {
    public static int Largest(int matrix[][]){
        int Max = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]>Max){
                    Max = matrix[i][j];
                }
            }
        }
        System.out.println("The Largest element from matrix is: "+Max);
        return Max;
    }
    public static int Smallest(int matrix[][]){
        int Min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<Min){
                    Min = matrix[i][j];
                }
            }
        }
        System.out.println("The Smallest element from matrix is: "+Min);
        return Min;
    }
    public static void main(String arg[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The elements of Matrix: ");
        //input:
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output:
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        Largest(matrix);
        Smallest(matrix);
    }
}
