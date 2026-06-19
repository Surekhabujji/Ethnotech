public class Outof
{
public static void main(String[] args)
{
try
{
String s="Welcome to java program";
char c=s.charAt(27);
System.out.println(c);
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println("Out of Range");
}
}
}