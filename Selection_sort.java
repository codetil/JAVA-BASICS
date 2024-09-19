public class Selection_sort {
    // Selection sort algorithm...
    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minindex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
                //swap elements...
                int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
                // for array to be printed in decending order just replace j inplace of at the time ofswapping...
            }
        }
    }
    public static void main (String args[]){
        int arr[]={ 5, 4, 1, 3, 2};
        selectionsort(arr);
        //print sorted array...
        //for - each loop
        for(int num : arr){
            System.out.print(num +" "); 
        }
    }
}
