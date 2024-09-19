import java.util.*;
// Print reverse of number...
public class ReverseofNumbers {
    public static void main (String args[]){
// Taking input from user...
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number = ");
        int n = sc.nextInt();

        while (n>0) {
// By taking modulo we can get a number of lastdigit as remainder...
            int lastdigit = n%10;
            System.out.print(lastdigit);
// By doing division we can decreasing last digit of a number as a quotient...
            n=n/10; //n/=10
        }
        sc.close();
    }
    
}
