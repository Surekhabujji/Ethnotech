public class Vote 
{
static void validate(int age)
{
if(age<18)
{
throw new ArithmeticException("not eligible for vote");
}
else
{
System.out.println("Welcome to vote");
}
}
public static void main(String[] args)
{
validate(13);
System.out.println("rest of the code...");
}
}