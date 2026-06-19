import java.util.*;
interface Add{
void add();
}
interface Sub{
void sub();
}
class C implements Add,Sub{
Scanner sc=new Scanner(System.in);
int a,b;
void getdata(){
System.out.println("Enter the numbers:");
a=sc.nextInt();
b=sc.nextInt();
}
public void add(){
System.out.println("Addition: "+(a+b));
}
public void sub(){
System.out.println("Subtraction: "+(a-b));
}
}
class MD extends C{
public void mul(){
System.out.println("Multiplication: "+(a*b));
}
public void div(){
System.out.println("Division: "+(a/b));
}
}
class Hybrid{
public static void main(String[] args){
MD h=new MD();
h.getdata();
h.add();
h.sub();
h.mul();
h.div();
}
}