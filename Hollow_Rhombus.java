import java.util.*;
public class Hollow_Rhombus {
    public static void printHollow_Rhombus(int totRows, int totCols){
        //outer loop
        for(int i=1; i<=totRows; i++){
            //inner loop
            //spaces to be printed
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }
            //Hollow Rectangle to be printed
            // Inner loop for printing stars or spaces
            for (int j=1; j<=totCols; j++){
                // Boundary cells
                if (i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter rows : ");
        int totRows = sc.nextInt();
        System.out.print("Enter columns : ");
        int totCols = sc.nextInt();
        printHollow_Rhombus(totRows, totCols);
        sc.close();
    }
}
