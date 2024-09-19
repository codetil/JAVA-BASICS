public class FunctionPrimeorNot {
    // Only for n>=2
    public static boolean isprime(int n){
        //Corner Cases :- It doesn`t check line normal no it directly tells that it is true.
        if(n==2){
        return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
            //Completely dividing
            return false;
            }
        }
        return true;
    }  
    public static void main (String args[]){
        System.out.println(isprime(16));
    }
}
