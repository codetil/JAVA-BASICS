import java.util.Scanner;

public class Hollow_Rectangle {
    public static void printHollow_Rectangle(int totRows, int totCols){
        // Outer loop
        for (int i=1; i<=totRows; i++){
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
        System.out.println("Enter rows : ");
        int totRows = sc.nextInt();
        System.out.println("Enter columns : ");
        int totCols = sc.nextInt();
        printHollow_Rectangle (totRows, totCols);
        sc.close();
    }
}
