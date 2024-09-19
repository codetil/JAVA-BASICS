import java.util.*;

public class AssignmentOperators {
     public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
//Assignment Operators...
        System.out.println("Enter your number A = ");       
        int a = sc.nextInt();
        System.out.println("Enter your number B = ");  
        int b = sc.nextInt();
        System.out.println("A is = "+a);
        System.out.println("B is = "+b); 
// Ex. 1) A assigned to B...
        System.out.println("A = B = "+ (a=b));
// Ex. 2) A += 10...
        System.out.println("A += 10 = "+ (a+=10));
// Ex. 3) A -= 10...
        System.out.println("A -= 10 = "+ (a-=10));
// Ex. 4) A *= 10...
        System.out.println("A *= 10 = "+ (a*=10));
// Ex. 5) A /= 10...
        System.out.println("A /= 10 = "+ (a/=10));
        sc.close();
     }
    
}
