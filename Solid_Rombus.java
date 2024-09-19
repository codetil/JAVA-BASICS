import java.util.*;
public class Solid_Rombus {
    public static void print_solid_rombus(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            //spaces to be printed
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars to be printed
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        print_solid_rombus(n);
        sc.close();
    }
}
