import java.util.*;
public class Palindrome_or_not {
    public static boolean palindrome(String str){
        for(int i=0; i<str.length(); i++){
            int n = str.length();
            if(str.charAt(i) == str.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String print = "Enter the string to check : ";
        System.out.println(print);
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next();
        System.out.print(palindrome(str));
        sc.close();
    }
}