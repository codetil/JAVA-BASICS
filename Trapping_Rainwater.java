public class Trapping_Rainwater {
    public static int trapped_rainwater(int height[]){
        int n = height.length;
        //Calculate left max boundary - array
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++){
            //water level = min(left max boundary - right max boundary )
            int waterlevel = Math.max(leftMax[i], rightMax[i]);
            //Trapped water = water level - height[i]
            trappedwater += waterlevel - height[i]; 
        }  
        return trappedwater;     
    }
    public static void main (String args[]){
        System.out.print("The total trapped water is : ");
        int height[]={ 4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapped_rainwater(height)+" unit.");
    }  
}
