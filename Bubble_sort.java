public class Bubble_sort {
        public static void bubblesort(int arr[]){
            //Bubble sort algorithm...
            for(int i=0; i<arr.length-1; i++){
                for(int j=0;j<arr.length-1-i; j++){
                    if(arr[j]>arr[j+1]){
                        //swapp
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        public static void main (String args[]){
        int arr[]={ 5, 4, 1, 3, 2};
        bubblesort(arr);
        //print sorted array...
        //for - each loop
        for(int num : arr){
            System.out.print(num +" "); 
        }
    } 
}
