import java.util.*;
// Calculate simple interest taking user input as principle amount , %rate of interest & no of years....
public class simpleInterest {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter principle amount : ");
        int principle = sc.nextInt();
        System.out.print("Enter rate of interest : ");
        int rate = sc.nextInt();
        System.out.print("Enter time of duration : ");
        int time = sc.nextInt();
        int SI = (principle*rate*time)/100;
        System.out.println("The Simple Interest earned is : "+SI);
        System.out.print("The total value is : "+(principle+SI));
        sc.close();
    }
}
