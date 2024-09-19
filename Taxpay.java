import java.util.*;
public class Taxpay {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the price of pen :");
        double penprice = sc.nextDouble();
        System.out.println("Enter the price of pencil :");
        double pencilprice = sc.nextDouble();
        System.out.println("Enter the price of eraser :");
        double eraserprice = sc.nextDouble();
        double totalcost = (penprice + pencilprice + eraserprice);
        double gstcost = (totalcost * 0.18);
        double finalcost = (totalcost+gstcost);
        System.out.println("Generated bill is :- \n The price of pencil is "+ pencilprice+" .\n The price of pen is "+penprice+" .\n The price of eraser is "+eraserprice+" .\n The total cost is "+totalcost+" .\n The 18 % GST on total cost is "+gstcost+" .\n The final cost is "+finalcost+" .");
        sc.close();
    }
}
