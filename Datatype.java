import java.util.*;
public class Datatype {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        //Taking input for each datatype
        System.out.println("Enter byte data :");
        byte b = sc.nextByte();//nextByte used to take input for byte datatype.
        System.out.println(b);
        //In java char data can't directly take input from the user beacuse scanner class doesn,t have a method of Scanner to read a string.
        System.out.println("Enter char data :");
        char ch = sc.next().charAt(0);//charAt(0) method of string extract the characters of that string.
        System.out.println(ch);
        //nextBoolean used to take input for boolean datatype.
        System.out.println("Enter boolean data :");
        boolean var = sc.nextBoolean();
        System.out.println(var);
        //nextFloat used to take input for float datatype.
        System.out.println("Enter float data:");
        float rupees = sc.nextFloat();//Always write f after floating value ,coz In Java, when you write a floating-point number without a suffix, it is treated as a double by default. If you want to specify a float (which is a single-precision 32-bit IEEE 754 floating point), you need to add an f or F suffix to the number.
        //For example, 3.14 is a double, and 3.14f is a float.
        System.out.println(rupees);
        //nextDouble used to take input for Double datatype.
        System.out.println("Enter Double data :");
        double price = sc.nextDouble();
        System.out.println(price);
        //nextInt used to take input for int datatype.
        System.out.println("Enter int data :");
        int num = sc.nextInt();
        System.out.println(num);
        //nextShort used to take input for short datatype.
        System.out.println("Enter short data :");
        short n = sc.nextShort();
        System.out.println(n);  
        sc.close();//In java the scanner uses system resources (like file descriptors)to operate if we didn't close it will lead to resource leak & potentially slow down or clash program.
     }
    
}
