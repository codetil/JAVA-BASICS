import java.util.*;
// Print whether a,b,c which is largest no...
public class PrintLargestof3Numbers {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter A number = ");
        int a = sc.nextInt();
        System.out.print("Enter B number = ");
        int b = sc.nextInt();
        System.out.print("Enter C number = ");
        int c = sc.nextInt();
        if (a>=b && a>=c ){//(a>c)
            System.out.println("A is largest of 3 numbers.");
        }
        else if (b>=c){//(b>c && c>a)
            System.out.println("B is largest of 3 numbers");
        }
        else {
            System.out.println("C is largest of 3 numbers");
        }
        sc.close();
    }
}
