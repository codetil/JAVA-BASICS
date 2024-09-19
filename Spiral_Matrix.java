public class Spiral_Matrix {
    public static void main (String args[]){
        int matrix [][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(top <= bottom && left <= right){
            //top
            for(int i = left; i <= right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            //right
            for(int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            //bottom
            for(int i = right; i >= left; i--){
                if(top == bottom){
                    break;
                }
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;
            //left
            for(int i = bottom; i >= top; i--){
                if(left == right){
                    break;
                }
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
    }
    
}
