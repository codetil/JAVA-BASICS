import java.util.*;
public class StudentPassorFail {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your marks = ");
        int marks = sc.nextInt();
        String status = (marks>=33) ? "Pass" : "Fail" ;
        System.out.print("Status of student : " + status);
        sc.close();

    }
    
}
