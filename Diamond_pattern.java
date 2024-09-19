import java.util.*;
public class Diamond_pattern {
    public static void print_diamond_pattern(int n){
        //outer loop of 1st half...
        for(int i=1; i<=n; i++){
            //inner loop
            //spaces to be printed
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars to be printed
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop of 2nd half...
        for(int i=n; i>=1; i--){
            //inner loop
            //spaces to be printed
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars to be printed
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        print_diamond_pattern(n);
        sc.close();
    }
}
