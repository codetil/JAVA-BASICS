import java.util.*;
public class FunctionProduct {
    public static int calculateProduct(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int product = calculateProduct(a,b);
        System.out.println("Product of a & b: "+product);
        product=calculateProduct(10,20);
        System.out.println("Product of a & b: "+product);
        //like this if we write simple just calculate product function we can calculate many values in only 1 code by just calling this function.
        sc.close();
    }
    
}
