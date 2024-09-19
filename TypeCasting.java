import java.util.*;

public class TypeCasting {
    //TypeCasting also called as narrowing or explicit conversion...
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float a = 10.53f;
        int b = (int)a;
        System.out.println(b);
        
    // Example of marks in typecasting...
       float number = 99.97f;
       int marks = (int) number ;
       System.out.println(marks);

    //Example of character in typecasting...
        char ch = 'A';
        int order = (int) ch;
        System.out.println(order);//in int it return the ASCII value of char.
        char ch2 = 'a';
        int order2 = (int) ch2;
        System.out.println(order2);
     sc.close();
     }
}
