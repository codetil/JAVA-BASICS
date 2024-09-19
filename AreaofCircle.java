import java.util.*;
// Calculate area of circle...
public class AreaofCircle {
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter radius r : ");
      double r = sc.nextInt();
      double area = Math.PI*r*r;
      System.out.println(area);
      sc.close();
   }
}
