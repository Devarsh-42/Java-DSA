public class Polymorphism {
    public static void main(String arg[]) {
        calculator calc = new calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 5.5, (float) 6.7));
        System.out.println(calc.sum(2, 5, 6));

        //Overriding:
        Dear d = new Dear();
        d.eats();
    }
}
    //Method Overriding:
    class Animals{
        void eats(){
            System.out.println("Animals eats");
        }
    }
    class Dear extends Animals{
        void eats(){
            System.out.println("Dear eats grass");
        }
    }
    //Method Overloading:
    class calculator{
        int sum(int a , int b){
            return a + b;
        }
        float sum(float a , float b){
            return a + b;
        }
        int sum(int a , int b , int c){
            return a + b + c;
        }
    }

