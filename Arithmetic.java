import java.util.Scanner;
public class Arithmetic
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Two Values");
int a=sc.nextInt();
int b=sc.nextInt();
try
{
int c=a/b;
System.out.println("result :"+c);
}
catch(ArithmeticException e)
{
System.out.println("Divide with number by 0");
}
}
}
