//Given route(String) contains 4 directions(E,W,N,S) find shortest Dist.to reach Final Point
public class ShortestPath {
    public static void main(String arg[]){
        String route = "WNEENESENNN";
        int x=0; int y=0;
        for(int i=0; i<route.length(); i++){
            if(route.charAt(i) == 'W'){
                x--;//West
            }
            else if(route.charAt(i) == 'S'){
                y--;//South
            }
            else if(route.charAt(i) == 'N'){
                y++;//North
            }
            else if(route.charAt(i) == 'E'){
                x++;//East
            }
        }
        double Displacement = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The Shortest Path from (0,0) to ("+x+","+y+") is : "+Displacement);
    }
}
