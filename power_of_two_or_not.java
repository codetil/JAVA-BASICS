public class power_of_two_or_not {
    public static boolean ispowerofTwo(int n){
        return(n&(n-1)) == 0;
    }
    public static void main (String args[]){
        System.out.println(ispowerofTwo(16));
    }
}
