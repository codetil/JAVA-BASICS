public class Sum_of_diagonal_of_matrix {
    /*public static void main(String[] args) {
        int matrix [][] = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}};
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }else if(i+j == matrix.length-1){
                sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements is: " + sum);
    }*/
    public static void main(String[] args) {
        int matrix [][] = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}};
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i != matrix.length-1-i)
            sum+= matrix[i][matrix.length-i-1];
        }
        System.out.println("Sum of diagonal elements is: " + sum);
    }
}
