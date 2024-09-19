import java.util.Scanner;

public class convertDectoBin {
    public static void DectoBin(int n){
        int mynum = n;
        int pow = 0;
        int Binnum = 0;
        while (n>0){
            int rem = n%2;
            Binnum = Binnum + (rem * (int) Math.pow (10 , pow));
            pow ++;
            n = n/2;
         }
         System.out.println("Decimal form of " + mynum + " is " + Binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num n : ");
        int n = sc.nextInt();
        DectoBin(n);
        sc.close();
    }
}
