public class Inheritance {
    public static void main(String arg[]){
        Fish Shark = new Fish();
        Shark.eats();//Inherited

        //Eg of Multi level In heritance
        Dogs Tom = new Dogs();
        Tom.eats();
        Tom.legs = 4;
        Tom.Breed = "BullDog";

    }
    // BASE / PARENT CLASS:
    static class Animals{
        void eats() {
            System.out.println("Hunts & eats");
        }
        void breathes(){
            System.out.println("Inhales");
        }
    }

    // DERIVED / CHILD CLASS: // SINGLE LEVEL INHERITANCE -- Animals --> Fish
    static class Fish extends Animals {
        void swim(){

            System.out.println("Swims Fast AF");
        }
        void fins(){
            System.out.println("Swims through fins");
        }
    }

    // MULTI LEVEL INHERITANCE
    static class Mammals extends Animals{
        int legs;// Can also def a func.
    }
    static class Dogs extends Mammals{
        String Breed;
    }
}
