import java.util.*;
public class Syntax {
    public static boolean ElementSearch(int matrix[][], int key){
        //For Searching index of the element in the Matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found the element "+key+" at index ("+i+","+j+") of matrix");
                    return true;
                }
            }
        }
        System.out.println("The Element "+key+" is not found in matrix");
        return false;
    }
    public static void main(String arg[]){
        int matrix[][] = new int[3][4];
        int n = matrix.length;//ROWS
        int m = matrix[0].length;//COLUMN
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of Matrix: ");
        //Input of Matrix:
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output:
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        ElementSearch(matrix,8);//For Searching index of the element in the Matrix
    }
}
