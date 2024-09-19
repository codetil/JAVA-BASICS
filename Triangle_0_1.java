import java.util.*;
public class Triangle_0_1{
    public static void print_Triangle_0_1(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for (int j=1; j<=i; j++){
                //condition for even
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }   
     }
     public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        print_Triangle_0_1(n);
        sc.close();
     }
}
