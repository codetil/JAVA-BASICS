import java.util.*;

public class SumofAB {
   //Calculate Sum of A & B...
    /*  public static void main(String args[]){
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
        */
   // Calculate sum of A & B using taking user input...
   public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      System.out.print("Enter a : ");
      int a = sc.nextInt();
      System.out.print("Enter b : ");
      int b = sc.nextInt();
      int sum = a + b;
      System.out.println("The sum of a & b is : "+sum);
      sc.close();
   }
}
