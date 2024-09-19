import java.util.*;

public class TypePromotion {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
//Type Promotion 1 :- char,byte,short to int...
        char a = 'a';
        char b = 'b';
        System.out.println(b-a);
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b);

//Example of type promotion...
        short c = 5;
        byte d = 25;
        char e = 'c';
        byte bt = (byte)(c+d+e);
        System.out.println(bt);
        System.out.println((int)c);
        System.out.println((int)d);
        System.out.println((int)e);

//Type Promotion 2 :- int, float, long, double to double...
        int g = 10;
        float h = 20.25f;
        long i = 25;
        double j = 30;
        Double ans = g+h+i+j;
        System.out.println(ans);
        System.out.println(ans.getClass().getName());

//It is not allowed in java so by type casting we can print its value...   
        byte p = 5;
        byte q = (byte)(p*2);
        System.out.println(q);
        sc.close();
     }
}
