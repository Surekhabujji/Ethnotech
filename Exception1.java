public class Exception1
{
public static void main(String[] args){
try
{
int data=50/0;
}
catch(ArithmeticException e)
{
System.out.println("divided with zero");
}
System.out.println("rest of the code.........");
}
}
