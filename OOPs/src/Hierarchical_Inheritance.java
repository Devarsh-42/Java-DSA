public class Hierarchical_Inheritance {
    public static void main(String arg[]){
        Inheritance.Fish Shark = new Inheritance.Fish();
        Shark.eats();//Inherited
        Inheritance.Dogs Tom = new Inheritance.Dogs();
        Tom.eats();
        Tom.legs = 4;
        Tom.Breed = "BullDog";
    }
    static class Animals{
        void eats() {
            System.out.println("Hunts & eats");
        }
        void breathes(){
            System.out.println("Inhales");
        }
    }
    //All three classes extends the Animal class--> Hierarchical Inheritance
    static class Mammals extends Animals {
        void walk(){
            System.out.println("They Walk!");
        }
    }
    static class Fish extends Animals {
        void swim(){
            System.out.println("They Swim!");
        }
        void fins(){
            System.out.println("Swims through fins");
        }
    }
    static class Birds extends Animals{
        void fly(){
            System.out.println("They Fly!");
        }
    }
}