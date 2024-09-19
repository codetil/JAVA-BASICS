import java.util.*;
// Check whether no is prime or composite no...
public class PrimeNoorNot {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number = ");
        int n = sc.nextInt ();

        if (n==1){
            System.out.println("The number you have entered is neither prime nor composite.");
        }
        else {
            boolean isprime = true;
// in the place of n-1 we can also write Math.sqrt(n)...
// Math.sqrt(n) it is in a class named as math in java.utility package...
            for(int i = 2; i<=n-1; i++){
// n is multiple of i(i is not equal to 1 or n)...
                if (n%i== 0){
                    isprime = false;
                }
            }
            if (isprime == true){
                System.out.println("The number you have entered is prime.");
            }
            else {
                System.out.println("The number you have entered is composite.");
            }
        }
        sc.close();
    }
    
}
