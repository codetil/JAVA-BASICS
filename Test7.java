public class Test7 {
    public static void main(String[] args){
// Question 1...
    int x = 2, y = 5;
    int exp1 = (x * y / x);
    int exp2 = (x * (y / x));
    System.out.print(exp1 +  ",");
    System.out.print(exp2);
// Question 2...
// x=a , y=b , z=c ...
    int a = 200, b = 50, c = 100;
    if(a > b && b > c){
    System.out.println("Hello");
    }
    if(c > b && c < a){
    System.out.println("Java");
    }
    if((b+200) < x && (b+150) < c){
    System.out.println("Hello Java");
    }
// Question 3...
// x=d , y=e , z=f ...
    int d, e, f;
    d = e = f = 2;
    d += e;
    e -= f;
    f /= (d + e);
    System.out.println(d + " " + e + " " + f);
// Question 4...
// x=g , y=h , a=i , b=j , c=k...
   int g = 9, h = 12;
   int i = 2, j = 4, k = 6;
   int exp = 4/3 * (g + 34) + 9 * (i + j * k) + (3 + h * (2 + i)) / (i + j*h);
   System.out.println(exp);
// Question 5...
// x=m , y=n , exp1=exp3 , exp2=exp4 ...
   int m = 10, n = 5;
   int exp3 = (n * (m / n + m / n));
   int exp4 = (n * m / n + n * m / n);
   System.out.println(exp3);
   System.out.println(exp4);
 }
}
