class Student
{
int rollno;
String name;
static String college="SSI";
static void change()
{
college="MITS";
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String[] args){
Student.change();
Student s1=new Student(15,"Surekha");
Student s2=new Student(29,"Cherry");
s1.display();
s2.display();
}
}


BEFOR MAIN STATIC BLOCK WILL EXECUTE


FINAL KEYWORD EX
------------------>

class Bike
{
final int speed=90;
void run()
{
speed=400;
System.out.println("Speed Limit: "+ speed);
}
public static void main(String args[])
{
Bike b=new Bike();
b.run();
}
}