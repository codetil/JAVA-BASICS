import java.util.*;
public class DaysofWeek {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
    System.out.println("Enter a week number(1-7): ");
    int weeknumber = sc.nextInt();
    switch (weeknumber){
        case 1:System.out.println("It's the 1st day of week Monday.");
        break;
        case 2:System.out.println("It's the 2nd day of week Tuesday.");  
        break;
        case 3:System.out.println("It's the 3rd day of week Wednesday.");  
        break;
        case 4:System.out.println("It's the 4th day of week Thuresday.");  
        break;
        case 5:System.out.println("It's the 5th day of week Friday.");  
        break;
        case 6:System.out.println("It's the 6th day of week Saturday.");  
        break;
        case 7:System.out.println("It's the 7th day of week Sunday.");  
        break;
        default:System.out.println("Invalid input! Please enter week number between (1-7).");  
    sc.close();
}
}
    
}
