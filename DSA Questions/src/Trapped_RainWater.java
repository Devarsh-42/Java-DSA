//PYQ
//Calculate The Volume of Trapped Water , where height of buildings is given in array.
public class Trapped_RainWater {
    public static int TrappedRainWater(int Height[]){
        int n = Height.length;
        //Calculate Left Max Boundary:
        int LeftMax[] = new int[n];
        LeftMax[0] = Height[0];
        for(int i =1; i<n; i++){
            LeftMax[i] = Math.max(Height[i],LeftMax[i-1]);
        }
        //Calculate Max Right Boundary:
        int RightMax[] = new int[n];
        RightMax[n-1] = Height[n-1];
        for(int i = n-2 ; i>=0; i--){
            RightMax[i] = Math.max(Height[i],RightMax[i+1]);
        }
        //Main Loop For Water Level:
        int trappedwater = 0;
        for(int i=0; i<n; i++){
            //WaterLevel = min of(Left MAx Bound & Right MAx Bound)
            int waterlevel = Math.min(LeftMax[i],RightMax[i]);
            // trappedwater = WaterLevel - Height of the Bar
            trappedwater += waterlevel - Height[i];  //+ trappedwater;
        }
        return  trappedwater ;
    }
    public static void main(String arg[]){
        int Height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappedRainWater(Height));
        //Time Complexity : O(n)
    }
}
