import java.util.*;
public class Butterfly_pattern {
    //for 1st half of butterfly pattern...
    public static void print_butterfly_pattern(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            //stars:-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces:-2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars:-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for mirror image of 1st half of butterfly pattern...
        for(int i=n; i>=1; i--){
            //inner loop
            //stars:-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces:-2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars:-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        print_butterfly_pattern(n);
        sc.close();
    }
}
