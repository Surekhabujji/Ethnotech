class static1
{
static int a;

static
{
System.out.println("Static block is executed");
}
static void method()
{
System.out.println("Static method is executed");
}
}
public class Static {
public static void main(String[] args)
{
System.out.println(static1.a);
static1.method();
}
}