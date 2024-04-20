public class Getters_Setters {
    public static void main(String arg[]){
        newPen p1 = new newPen();// Created a PEN object called p1; // Pen() is called Constructor

        p1.SetColor("Blue");

        p1.SetTip(5);

        p1.SetColor = "Red";
        // Now we cannot access color with Dot(.) operator bcoz private

        System.out.println("Colour of the Pen = "+p1.GetColor()+" & Tip Size = "+p1.GetTip());

    }
}
class newPen{
    public String SetColor;// group of objects with == Attributes (Properties) + Functions (Behaviors)
        // Attributes:
    private String Color;
    private int tip;

    // Functions:
    String GetColor(){// Getters
        return this.Color;
    }
    int GetTip(){//Getters
        return this.tip;
    }
    void SetColor(String Color){//Setters
        this.Color = Color;
    }
    void SetTip(int tip){//Setters
        this.tip = tip;
    }
}

