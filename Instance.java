class Instance1
{
int x;
{
System.out.println("Instance block is executed");
}
void display()
{
System.out.println("Instance method is executed");
}
public Instance1()
{
System.out.println("Constructor called");
}
}
public class Instance
{
public static void main(String[] args)
{
Instance1 i=new Instance1();
System.out.println(i.x);
i.display();
}
}