public class SubArrays {
    public static void PrintSubArrays(int num[]){
        int Ts = 0;
      for(int i=0; i<num.length;i++){

          //int start = i; Just for learning (First Time only)
          for(int j=i; j<num.length;j++){
             // int end = j; No actual need of this line
              for(int k = i; k <= j ;k++){
                  System.out.print(num[k]+" ");
                  Ts++;
              }
              System.out.println();
          }
          System.out.println();

      }
        System.out.println("Total subarrays = "+ Ts);

    }
    public static void main(String arg[]){
        int num[] = {2,4,6,8,10};
        PrintSubArrays(num);
    }
}
