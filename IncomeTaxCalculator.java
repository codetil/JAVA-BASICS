import java.util.*;
public class IncomeTaxCalculator {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your income amount = ");
        int income = sc.nextInt();
        int tax = 0;
        if (income<500000){
            tax = 0;
        }
        else if (income>=500000 && income<1000000){
            tax = (int) (income*0.1);
        }
        else {
            tax = (int) (income*0.3);
            
        }
        System.out.println("Your tax is = "+ tax);
        
        sc.close();
    }
}