import java.util.*;

public class Sumof1toNnumbers {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter number n = ");
        int n = sc.nextInt() ;
        int i = 1 ;
        int sum = 0 ;

        while (i <= n) {
            sum += i ;
             i++;
        }
        System.out.println("Sum of "+ n + " natural number is = " + sum );
        sc.close();
    }
}
