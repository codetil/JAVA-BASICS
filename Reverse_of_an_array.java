public class Reverse_of_an_array {
    public static void reverse(int numbers[]){
        int first = 0 , last = numbers.length - 1;
        //swapping
        while(first<last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp; 
            first++;
            last--;
        }
    }
    public static void main (String args[]){
        int numbers[]={2,4,6,8,10};
        reverse( numbers );
        System.out.print("Reverse of an array is : ");
        for(int i=0; i<numbers.length; i++){
            System.out.print( numbers[i] +" " ); 
        }
        System.out.println();
    }
}

    

