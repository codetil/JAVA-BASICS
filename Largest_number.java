//import java.util.*;
public class Largest_number {
    public static int get_largest_number(int numbers[]){
        int largest = Integer.MIN_VALUE;// - infinity
        int smallest = Integer.MAX_VALUE;// + infinity
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        } 
        System.out.println("Smallest number is : "+smallest);
        return largest;
    }
    public static void main (String args[]){
        int numbers[]={2, 4, 6, 8, 10};
        System.out.println("Largest number is : "+get_largest_number(numbers));
    }
}
