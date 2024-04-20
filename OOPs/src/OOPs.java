public class OOPs {
    public static void main(String arg[]){
        Pen p1 = new Pen();// Created a Pen object called p1; // Pen() is called Constructor

        //To call a func. from a class: ObjectName.functionname(value A/C to DataType)
        p1.SetColor("Blue");

        p1.SetTip(5);// We can also change by calling it again & assigning a diff. vale.

        //Also:
        p1.Color = "Red";

        //To access an Attributes(Properties) of Object: ObjectName.PropertyName (Using Dot Operator)
        System.out.println("Colour of the Pen = "+p1.Color+" & Tip Size = "+p1.tip);

        //ACCESS MODIFIERS:
        BankAccount MyAcc = new BankAccount();
        MyAcc.Username = "Devarsh";
        // MyAcc.password = "12@HopeNotToBeReveled34"; ==> Would Show Error Bcoz. password is private.
        MyAcc.SetPassword("12HopeNotToBeReveled");//Private:You can change it but cannot access It.
    }
}
 class BankAccount{
    public String Username;
    private String password;

    public void SetPassword(String pwd){
        password = pwd;// Can Be Accessible bcoz Within the Class
    }
 }
 // Class == BluePrint of the objects
 class Pen{// group of objects with == Attributes (Properties) + Functions (Behaviors)
    // Attributes:
    String Color;
    int tip;

    // Functions:
    void SetColor(String newColor){
         Color = newColor;
    }
    void SetTip(int newTip){
        tip = newTip;
    }
 }
 class School{
    String name;
    int age;
    float percentage; //C.G.P.A

     void CalPercentage(int phy, int chem, int math){
         percentage = (phy + chem + math)*100/3;
     }
 }