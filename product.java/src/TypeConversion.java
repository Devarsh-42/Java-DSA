//Type casting & Type Conversion
public class TypeConversion{
    public static void main(String arg[]){
        //Type Conversion (Small to big data type)
        int a=798;
        float b = a;
        System.out.println(b);

        //Type Casting (Big to small data type)
        float cgpa = 9.79f;
        int cgpa2 = (int)cgpa;
        System.out.println(cgpa2);

        // Type Casting eg2
        char ch = '@';
        int x = (int)ch;
        System.out.println(x);


    }
}