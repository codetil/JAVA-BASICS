public class Max_subarray_sum_kadense_algorithm {
    //Kadense Algorithm...
    public static void kadense_algorithm(int numbers[]){
        int ms = Integer.MIN_VALUE;// for -infinity
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs+numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max sum of subarrays is : "+ ms);
    }
    public static void main (String args[]){
        int numbers[]={-2, -3, 4, -1, -2, 1, 5, -3};
        kadense_algorithm(numbers);
    } 
}
