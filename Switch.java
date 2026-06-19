import java.util.*;
class Switch {
int a, b, c;
void input() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value:");
a = sc.nextInt();
System.out.println("Enter b value:");
b = sc.nextInt();
}
void sum(){
c=a+b;
}
void sub(){
c=a-b;
}
void mul(){
c=a*b;
}
void div(){
c=a/b;
}
void output(){
System.out.println("result:"+c);
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
Switch s1=new Switch();
int ch=0;
while(ch!=5)
{
System.out.println("menu");
System.out.println("1.Addition");
System.out.println("2.subtraction");
System.out.println("3.product");
System.out.println("4.division");
System.out.println("choose choice");
ch=s.nextInt();
if(ch>=1&&ch<=4){
s1.input();
switch(ch) 
{
case 1:s1.sum();
s1.output(); break;

case 2:s1.sub();
s1.output(); break;

case 3:s1.mul();
s1.output(); break;

case 4:s1.div();
s1.output(); break;

}
}
else
if(ch==5){
System.out.println("Program over");
}
else {
System.out.println("Try again");
}
}
}
}





