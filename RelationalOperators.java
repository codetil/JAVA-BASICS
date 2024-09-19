import java.util.*;
public class RelationalOperators {
     public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
//Relational Operators...
        System.out.println("Enter your number A = ");       
        int a = sc.nextInt();
        System.out.println("Enter your number B = ");  
        int b = sc.nextInt();
        System.out.println("A is = "+a);
        System.out.println("B is = "+b);       
// Ex. 1) A is equalto B...
        System.out.println("A is equal to B = "+ (a==b));
// Ex. 2) A is not equal to B...
        System.out.println("A is not equal to B = "+ (a!=b));
// Ex. 3) A is greater than B...
        System.out.println("A is greater than B = "+ (a>b));
// EX. 4) A is less than B...
        System.out.println("A is less than B = "+ (a<b));
// Ex. 5) A is greater than equal to B...
        System.out.println("A is greater than equal to B = "+ (a>=b));
// Ex. 6) A is less than equal to B...
        System.out.println("A is less than equal to B = "+ (a<=b));
        sc.close();
     }
}
