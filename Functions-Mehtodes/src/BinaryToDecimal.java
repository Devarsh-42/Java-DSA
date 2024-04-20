public class BinaryToDecimal {
    public static void BinToDec(int BinNum) {
    int BinNo = BinNum;
    int pow=0;
    int dec=0;
    while(BinNum>0){
        int LastDigit = BinNum%10;
        dec = dec + (LastDigit * (int)Math.pow(2,pow));
        pow++;
        BinNum=BinNum/10;
    }
        System.out.println("The Decimal number of "+BinNo+" is : "+dec);
    }
    public static void main(String arg[]){
        BinToDec(101);
    }
}
