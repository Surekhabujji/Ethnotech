class Cricketer{
String name;
String team;
int age;
Cricketer(){ //default const
name="";
team="";
age=0;
}
Cricketer(String n,String t,int a){ //constructor overloaded
name=n;
team=t;
age=a;
}
Cricketer(Cricketer c){  //constructor similar to copy constructor of c++
name=c.name;
team=c.team;
age=c.age;
}
public String toString(){
return "this is " + name + " of " + team;
}
public static void main(String[] args){
Cricketer c1=new Cricketer();
Cricketer c2=new Cricketer("Rohith","india",32);
Cricketer c3=new Cricketer(c2);
System.out.println(c2);
system.out.println(c3);
c1.name="Charan";
c1.team="India";
c1.age=23;
system.out.println(c1);

}
}


COPYING VALUES WITHOUT CONSTRUCTOR
---------------------------------->
class Student1{
int id;
String name;
Student1(int i, String n){
id=1;
name=n;
}
student1()
{}
void display(){
System.out.println((id+" "+name);
}
public static void main(String[] args){
Student1 s1=new Student1(1,'revanth');
Student1 s2=new Student1();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();