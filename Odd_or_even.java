import java.util.*;
public class Odd_or_even {
    public static void OddorEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            //Even number...
            System.out.println("The number you ave entered is Even Number.");
        }
        else{
            System.out.println("The number you ave entered is Odd Number.");
        }
    }
    public static void main(String args[]){
        System.out.println("Enter no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OddorEven(n);
        sc.close();
    }
}
