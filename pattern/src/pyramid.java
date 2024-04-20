public class pyramid {
    public static void main(String arg[]) {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j<5-i; j++) //for the space in each Rows
                {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++)//For printing '*' (row number = num of * printed)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }


        }
    }
