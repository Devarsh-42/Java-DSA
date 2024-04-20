public class SpiralMatrix {
    public static void Spiral(int matrix[][]){
        int SR = 0; // Start Row
        int SC = 0; // Start Column
        int ER = matrix.length-1; // End Row
        int EC = matrix[0].length-1; // End Column
        while(SR <= ER && SC <= EC){
            //Top:
            for(int i=SC; i<=EC; i++){
                System.out.println(matrix[SC][i]+"\t");//[][] are fixed
            }
            //Right:
            for(int i=SR+1; i<=ER; i++){
                System.out.println(matrix[i][EC]+"\t");//[EC] is fixed , [i] is variable
            }
            //Bottom:
            for(int i=EC-1; i>=SC; i--){
                if(SR == ER){
                    break; // in n x n matrix , the center element gets printed twice,so to avoid that-
                }          //-we print this condition statement
                System.out.println(matrix[ER][i]+"\t");
            }
            //Left:
            for(int i=ER-1; i>=SR+1; i--){
                if(SC == EC){
                    break;
                }
                System.out.println(matrix[i][SC]);
            }
            SR++;
            SC++;
            ER--;
            EC--;

        }
        System.out.print("\t");
    }

    public static void main(String arg[]){
        int matrix[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        Spiral(matrix);
    }
}
