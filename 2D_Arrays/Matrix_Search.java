//Stare-Case Search with both approaches
public class Matrix_Search {
    public static void StareCaseSearch(int matrix[][], int key) {
        //CONSIDERING TOP RIGHT CORNER AS STARTING POINT
//        int row = 0;
//        int col = matrix[0].length-1;
//        while(row < matrix.length && col >=0){
//            if(key == matrix[row][col]){
//                System.out.println("Found the key at index: "+row+" , "+ col);
//                return;
//            }
//            else if (key > matrix[row][col]) {
//                row++;//Moving Down
//            }
//            else if(key < matrix[row][col]){
//                col--;//Moving Left
//            }
//        }
//        System.out.println("Key Does not exist");

        //CONSIDERING BOTTOM LEFT POINT AS STARTING POINT
        int row = matrix.length-1;
        int col = 0;

        while(col < matrix[0].length && row >= 0){
            if(key == matrix[row][col]){
                System.out.println("The is at  index: ("+row+" , "+col+")");
                return;
            }
            else if(key < matrix[row][col]){
                row--;//Moving UP
            }
            else if(key > matrix[row][col]){
                col++;
            }
        }
        System.out.println("The Key was not found");
}
    public static void main(String arg[]){
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,47},
                         {32,33,39,50}};
        int key = 33;
        StareCaseSearch(matrix,key);//Time Complexity: O(n+m)
    }
}
