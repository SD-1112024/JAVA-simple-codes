package JAVAPROGRAMMING;

public class IncrementDecrement {
    
    public static void main(String[] args) {
        int x=2;
        x+=x++ + ++x/2;// x=x+(x++ + ++x/2)
        System.out.println("The value of X is " + x);

/*int a=1;
int b=2;
int c;
int d;
c=++b;
d=a++;
c++;
System.out.println("The value of a is " + a);
System.out.println("The value of b is " + b);
System.out.println("The value of c is " + c);
System.out.println("The value of d is " + d);*/

int y=5;
y+=--y+y--+--y;//y=5

System.out.println(y);



}
}