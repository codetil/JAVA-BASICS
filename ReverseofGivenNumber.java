import java.util.*;
// Print reverse of given number & store them in it...
public class ReverseofGivenNumber {
    public static void main(String args[]){
// Taking input from user...
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number = ");
        int n = sc.nextInt();
        int rev = 0;

        while (n>0){
            int lastdigit = n%10;
            rev = (rev*10) + lastdigit;
            n=n/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
