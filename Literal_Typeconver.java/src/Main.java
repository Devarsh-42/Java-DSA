public class Main
{
    public static void main(String[] args)
    {
        //Literals-Literal values
        char c='a';
        c++;
        System.out.println(c);
        char a='e';
        a++;
        System.out.println(a);
        double x=12e5;//x== 1200000(12 x 10^5)
        System.out.println(x);

        //Different number systems
        int num=0b110;//for binary numbers syntax: 0<b><the value>
        System.out.println(num);
        int num2=0x7E;//for HaxeDecimal numbers syntax: 0<x><the value>(E=14)
        System.out.println(num2);
    }
}