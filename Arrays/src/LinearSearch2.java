import java.util.*;
public class LinearSearch2 {
    public static int select(String Games[],String name){
        int i=0;
        boolean isName=true;
        for(i=0;i<Games.length;i++){
            if(Games[i]==name){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String Games[] = {"Call Of Duty","Valorant","BGMI","Minecraft","Stamble Guys"};
        System.out.print("Enter the game number you want to play from the following games:\n"+ Games);
        String name = "Call Of Duty";
        int isName = select(Games,name);
        if(isName==0){
            System.out.println("\n"+name+" is not from the above list");
        }else{
            System.out.println("\nYou have selected : "+name);
        }
    }
}
