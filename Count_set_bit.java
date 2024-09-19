public class Count_set_bit {
    public static int countsetbit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){//Check our LSB 
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main (String args[]){
        System.out.println(countsetbit(10));
    }
}
