public class InvertedStarPattern {
    public static void main (String args[]){
        int n = 5;
        for (int i=n; i>=1; i--){
            for (int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* similar code :-
 public class Basics {
    public static void main(String[] args) {
        int n=4;
        for (int line = 1;line<=4;line++){
        for(int star=1;star<=(n-line+1);star++){
            System.out.print("*");
        } System.out.println();
    }
}
}
*/