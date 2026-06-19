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
Student.college();
Student s1=new Student(15,"Surekha");
Student s2=new Student(29,"Cherry");
s1.display();
s2.display();
}
