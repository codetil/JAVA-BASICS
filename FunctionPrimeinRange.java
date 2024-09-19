public class FunctionPrimeinRange {
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
    public static int primeinrange(int n){
        for(int i=2; i<=n; i++){
            //In this programme is prime function used as helper function.
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        return n;
    }
    public static void main (String args[]){
        primeinrange(10);    
    }  
}
