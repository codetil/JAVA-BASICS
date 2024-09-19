import java.util.*;
// Conditional Statements...
public class Ifelse {
// 1) if else statements...
    public static void main (String args[]){
// Step 1) Take inputs from user...
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age = ");
        int Age = sc.nextInt();
// Step 2) Write if condition...
        if (Age>=18){
            System.out.println("You are adult. \nYou can vote.");
        }
        else if (Age>=13 &&  Age<18){
            System.out.println("You are Teenager. \nYou can't vote.");
        }
        else {
            System.out.println("You are not adult. \nYou can't vote.");
         
        }
        sc.close();

    }
    
}
