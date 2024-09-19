import java.util.*;
public class FLOYDS_Triangle {
    public static void print_floyds_triangle(int n){
        //outer loop
        int counter = 1;
        for(int i=1; i<=n; i++){
            //inner loop:-How many times will counter be printed ?
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        print_floyds_triangle(n);
        sc.close();
    }
}
