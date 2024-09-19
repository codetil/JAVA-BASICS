import java.util.*;

public class ArithmaticOperators {
     public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

//Binary Arithmatic Operators...
        System.out.println("Enter value of a :");    
        int a = sc.nextInt();
        System.out.println("Enter value of b :");    
        int b = sc.nextInt();
        System.out.println("Enter value of a is :"+ a);
        System.out.println("Enter value of b is :"+ b);       
        System.out.println("Addition = "+ (a+b));
        System.out.println("Subtraction = "+ (a-b));
        System.out.println("Multiplication = "+ (a*b));
        System.out.println("Division = "+ (a/b));
        System.out.println("Modulo(Remainder) = "+ (a%b));

//Unary Arithmatic Operators...
    // 1. Increment Operators...
        // 1) Preincrement Operator...
        int p = sc.nextInt();
        int q = ++p;
        System.out.println("Number 1 = "+p);
        System.out.println("It's Preincrement = "+q);    
        // 2) Postincrement Operator...
        int r = sc.nextInt();
        int s = r++;
        System.out.println("Number 2 = "+r);
        System.out.println("It's Postincrement = "+s);  
        
    // 2. Decrement Operator...
        // 2) Predecrement Operator...
        int u = sc.nextInt();
        int v = --u;
        System.out.println("Number 3 = "+u);
        System.out.println("It's Predecrement = "+v);  
        // 2) Postdecrement Operator...
        int x = sc.nextInt();
        int y = x--;
        System.out.println("Number 4 = "+x);
        System.out.println("It's Postdecrement = "+y);  

//Example of unary operators...
        int g = sc.nextInt();
        int h = ++g;
        System.out.println("It's Preincrement = "+h);  
        int i = g++;
        System.out.println("It's Postincrement = "+i);   
        int j = --g;
        System.out.println("It's Predecrement = "+j);  
        int k = g--;
        System.out.println("It's Postdecrement = "+k);  
        sc.close();
     }
}