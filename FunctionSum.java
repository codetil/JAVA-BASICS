import java.util.*;

public class FunctionSum {
      public static int calculateSum(int a,int b){
        //Parameters or formal paramets :- Values which taken as input at function definition. 
        int sum = a+b;
        return sum;
    }
    public static void main (String args[]){ 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num 1: ");
        int a = sc.nextInt();
        System.out.println("Enter num 2: ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        //Arguments or actual parameters :- Values passed at function calls. 
        System.out.println("Sum is sum : "+ sum);
        sc.close();
    }
}
