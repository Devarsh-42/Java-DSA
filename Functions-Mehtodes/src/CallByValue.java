public class CallByValue {
    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;

    }
    public static void main(String arg[]){
        int a = 9;
        int b = 2;
        System.out.print("After Swap: ");
        System.out.print("a = "+a+"\t b ="+b);

        swap(a,b);
        //If print statement is here(man func.) the value will remain same, bcoz java uses call by value
//        System.out.print("After Swap: ");
//        System.out.print("a = "+a+" b ="+b);
    }
}
