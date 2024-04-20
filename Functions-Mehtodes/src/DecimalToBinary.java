public class DecimalToBinary {
    public static void DecToBin(int Dec){
        int DecNo=Dec;
        int rem=0;
        int pow=0;
        int Bin=0;
        while(Dec>0){
            rem=Dec%2;
            Bin=Bin + rem*(int)Math.pow(10,pow);
            pow++;
            Dec=Dec/2;
        }
        System.out.println("The Binary Number of "+DecNo+" is : "+Bin);
    }
    public static void main(String arg[]){
        DecToBin(11);
    }
}
