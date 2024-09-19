public class FunctionOverloading {
    //Function Overloading using parameter.
    //Calculate sum of 2 numbers.
    public static int sum (int a,int b){
        return a+b;
    }
    //Calculate sum of 3 numbers.
    public static int sum (int a,int b,int c){
        return a+b+c;
    }
    //Function Overloading using datatypes.
    //Product of 2 numbers using int.
    public static int product (int a,int b){
        return a*b;
    }
    //Product of 2 numbers using float.
    public static float product (float a,float b){
        return a*b;
    }
    //In java we can write many function in same class.
    public static void main (String args[]){
        System.out.println(sum(3,2));
        System.out.println(sum(3,2,1));
        System.out.println(product(3,5));
        System.out.println(product(3.0f,2.0f));
    }
}
