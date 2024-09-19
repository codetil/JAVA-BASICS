import java.util.*;
public class Recursion {
    // Print numbers from n to 1 (Decreasing Order)
    public static void printDec(int n){
        if(n == 1){
        System.out.println(n);
        return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    // Print numbers from n to 1 (increasing order)
    public static void printInc(int n){
        if(n == 1){
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    // Print factorial of number N
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    // Print sum of n natural numbers
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n+Snm1;
        return Sn;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be printed in Increasing & Decreasing order: ");
        int n = sc.nextInt();
        System.out.println("Numbers in decreasing order are as follows: ");
        printDec(n);
        System.out.println("Numbers in increasing order are as follows: ");
        printInc(n);
        System.out.println("Factorial of number n is: "+fact(n));
        System.out.println("Sum of n natural number is: "+calcSum(n));
        sc.close();
    }
}



