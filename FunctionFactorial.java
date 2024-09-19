import java.util.*;
public class FunctionFactorial {
       public static int factorial(int n){
        int f = 1;
        for (int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num n : ");
        int n = sc.nextInt();
        System.out.println("Factorial is n!: "+factorial(n));
        //we can directly used function in print statement for execution.
        sc.close();
    }
}
