import java.util.*;
public class inverted_rotated_half_pyramid {
    public static void print_inverted_rotated_half_pyramid(int n) {
    //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        print_inverted_rotated_half_pyramid(n);
        sc.close();
    }
}
