public class Interfaces {
    public static void main(String arg[]){
        Queen Q1 = new Queen();
        Q1.moves();
    }
}
interface ChessPlayer{//BluePrint of a Blueprint
    void moves();//--> by default public, abstract but we cannot write its implementation
}
class Queen implements ChessPlayer{//Blueprint of a particular component
    public void moves(){
        System.out.println("Moves up, down, left, Right, & also Diagonal.");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Moves up, down, left, Right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Moves up, down, left, right, & Diagonal (all by 1 step)");
    }
}
