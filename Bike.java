class Bike
{
int speed=50;
}
class V extends Bike
{
int speed=100;
void display()
{
System.out.println(super.speed);
}
public static void main(String[] args)
{
V v=new V();
v.display();
}
}
