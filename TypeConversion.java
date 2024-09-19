import java.util.*;

public class TypeConversion {
    //Type Conversion also called as widening & impicit conversion
     public static void main(String args[]){
        //Type Conversion using without taking input from user
        int a = 10;
        long b = a;
        System.out.println(b);
        //Type Conversion using taking input from user
        Scanner sc = new Scanner (System.in);
        float number = sc.nextFloat();
        System.out.println(number);
        System.out.println(Float.class.getName());
      sc.close();
     }
}
