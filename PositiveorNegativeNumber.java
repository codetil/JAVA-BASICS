import java.util.*;
// Print whether given number is positive or negative...
// This is question 1) of practise set (Conditional Prombles)...
public class PositiveorNegativeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number = ");
        double x = sc.nextDouble();
        if (x>0) {
             System.out.print("The number you have entered is Positive.");
        }
        else if (x==0) {
           System.out.print("The number you have entered is Zero."); 
        }
        else {
            System.out.print("The number you have entered is Negative."); 
        }
        sc.close();
    }
    
}
