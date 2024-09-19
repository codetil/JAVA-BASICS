import java.util.*;

public class Array_2D {
    public static void search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        System.out.println("The matrix you entered:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
        sc.close();
    }
}