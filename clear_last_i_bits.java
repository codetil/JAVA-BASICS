public class clear_last_i_bits {
    public static int clearlastibits(int n, int i){
        int bitmask = (-1)<<i;
        return n & bitmask;
    }
    public static void main (String args[]){
        System.out.println(clearlastibits(15,2));
    }
}
