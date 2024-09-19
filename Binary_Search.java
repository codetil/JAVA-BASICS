//import java.util.*;
//Binay Search
public class Binary_Search {
    public static int get_binary_Search(int numbers[],int key){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            //comparisons
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){//right side
                start = mid+1;
            }
            else{//left side
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int numbers[]={2, 4, 6, 8, 10, 12};
        int key=6;
        System.out.println("Index for key is : "+get_binary_Search( numbers, key));
    }
}
