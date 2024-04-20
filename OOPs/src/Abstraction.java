public class Abstraction {
    public static void main(String arg[]) {
        // Animal A1 = new Animal(); Will show an error bcoz Parent Abstract class cannot have an object

        Horse Jarvis = new Horse();
        Jarvis.eats();
        Jarvis.walk();

        Eagel Phoniex = new Eagel();
        Phoniex.eats();
        Phoniex.walk();

        System.out.println("\nConstructor calling Hierarchy: ");
        Mustang myHorse = new Mustang();
        myHorse.walk();
        //Animal --> Horse --> Mustang
    }
}
    abstract class Animal{
        Animal(){//Animal Constructor called.
            System.out.println("Animal Constructor Called");
        }
        //Non-abstract method/function
        void eats(){
            System.out.println("Animal eats");
        }
        //ABSTRACT METHOD/FUNCTION:
        abstract void walk(); // no implementation in abstract object.
    }
    class Horse extends Animal{
        Horse()
        {//Horse Constructor called
            System.out.println("This is the constructor of Horse");
        }
        void walk(){ //--> Inherited abstract method/function

            System.out.println("Walks on 4 legs");// Must be defined in every subclass
        }
    }
    class Eagel extends Animal{
        void walk()
        {
            System.out.println("Walks on 2 legs");
        }
    }
    class Mustang extends Horse{
        Mustang()//--> this is constructor of the subclass hence it does't have a return type
        {
            System.out.println("Constructor of Mustang Horse not the car");
        }
    }

