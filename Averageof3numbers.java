import java.util.*;
public class Averageof3numbers {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no a = ");
        int a = sc.nextInt();
        System.out.println("Enter no b = ");
        int b = sc.nextInt();
        System.out.println("Enter no c = ");
        int c = sc.nextInt();
        int sum = (a+b+c)/3;
        System.out.println("The average of a , b & c is "+sum);
        sc.close();
    }
}
