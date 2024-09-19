import java.util.*;
public class inverted_half_pyramid {
    public static void print_inverted_half_pyramid_with_numbers(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt ();
        print_inverted_half_pyramid_with_numbers(n);
        sc.close();
    }
}
