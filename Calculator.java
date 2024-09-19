import java.util.*;
// Basic Calculator using switch statements...
public class Calculator {
    public static void main(String args[]){
// Take inputs from user...
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        System.out.print("Enter b number = ");
        int b = sc.nextInt();
        System.out.print("Enter operation to perform = ");
// .charAt(0); it uses to take input from user as a character...
        char Operator = sc.next().charAt (0);
// Use swich case to buid it...
// Break is used to break the code if 1st case is satisfied and executed otherwise it will checks excutes all cases...
        switch (Operator){
            case '+' : System.out.println("Addition is = "+(a+b));
                       break;
            case '-' : System.out.println("Subtraction is = "+(a-b));
                       break;
            case '*' : System.out.println("Multiplication is = "+(a*b));
                       break;
            case '/' : System.out.println("Division is = "+(a/b));
                       break;  
            case '%' : System.out.println("Modulo is = "+(a%b));
                       break; 
            default : System.out.println("Wrong Operator.");
        }
            
         sc.close();

    }
    
}
