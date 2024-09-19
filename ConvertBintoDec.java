import java.util.Scanner;
public class ConvertBintoDec {
    public static void BintoDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum>0){
            int ld = binNum % 10;
            decNum = decNum + (ld*(int)Math.pow(2,pow));
            pow ++;
            binNum = binNum/10;
        }
        System.out.println("Decimal no " + myNum + " = " + decNum);
    } 
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter binary number : ");
        int binNum = sc.nextInt();
        BintoDec(binNum);
        sc.close();
    }
}