import java.util.*;
// to display all numbers entered by user except multiple of 10...
public class ContinueKeyword {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        boolean condition = true;
        do {
            System.out.print("Enter your number =  ");
            int i = sc.nextInt();
            if (i % 10 == 0) {
                condition = false;
                continue;
            }
            System.out.println("number was = " + i);
        }
        while (condition);
        sc.close();
    }
}
