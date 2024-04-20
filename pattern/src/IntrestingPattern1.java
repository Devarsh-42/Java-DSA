public class IntrestingPattern1 {
//          To Be Printed:
//            4444444
//            4333334
//            4322234
//            4321234
//            4322234
//            4333334
//            4444444

    public static void main(String[] args) {
        int counter = 0;
        int num[] = {4, 4, 4, 4, 4, 4, 4};
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j]);
            }
            System.out.println();
            num = changeArray(num, counter++);
        }
    }
        public static int[] changeArray(int[] num,int counter){
            if (counter < 3) {
                for (int i = counter + 1; i < num.length - counter - 1; i++) {
                    num[i] = num.length - counter - 4;
                }
            }
            else {
                for (int i = counter + 1; i < num.length - counter - 1; i++) {
                    num[i] = counter + 2;
                }
            }
            return num;
        }
    }