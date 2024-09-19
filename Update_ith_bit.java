public class Update_ith_bit {
    // Used to set ith bit
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    // Used to clear ith bit 
    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    // for update ith bit
    public static int updateithbit(int n, int i, int newbit){
       //we can also use this to update ith bit 
       /*if(newbit == 0){
            return clearithbit(n, i);
        }
        else{
            return setithbit(n, i);
        }*/

        //For more understanding use this
        n = clearithbit(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(updateithbit(10, 2, 1));
    }
    
}
