public class Insertion_sort {
    public static void insertionsort(int arr[]){
        //Insertion sort algorithm...
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //Finding out te correct position to insert...
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insertion...
            arr[prev+1] = curr;
            }
        }
    public static void main (String args[]){
        int arr[]={ 5, 4, 1, 3, 2};
        insertionsort(arr);
        //print sorted array...
        //for - each loop
        for(int num : arr){
            System.out.print(num +" "); 
        }
    }
}
