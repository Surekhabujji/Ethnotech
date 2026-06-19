import java.util.*;
class Power{
int mno,l,p,units;
String name;
char c;
double ur,bill;
void input(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter meter no:");
mno=sc.nextInt();
System.out.println("Enter customer name:");
name=sc.next();
System.out.println("Enter last month reading:");
l=sc.nextInt();
System.out.println("Enter present month reading:");
p=sc.nextInt();
System.out.println("Enter category(h/b/f):");
c=sc.next().charAt(0);
}
void check(){
units=p-l;
if(c=='h'){
if(units<200)
ur=1.5;
else if(units<400)
ur=2.1;
else if(units<700)
ur=4.6;
else if(units<1000)
ur=7.9;
else
ur=12;
}
else if(c=='b'){
if(units<4000)
ur=10.9;
else if(units<7000)
ur=12.9;
else if(units<10000)
ur=15;
else
ur=17.9;
}
else if(c=='f'){
if(units<20000)
ur=19;
else if(units<23000)
ur=22.1;
else if(units<25000)
ur=24.5;
else
ur=26.9;
}
bill=units*ur;
}
void display(){
System.out.println("Meter No:"+mno);
System.out.println("Customer Name:"+name);
System.out.println("Units:"+units);
System.out.println("Unit Rate:"+ur);
System.out.println("Bill Amount:"+bill);
}
public static void main(String[] args){
Power p1=new Power();
p1.input();
p1.check();
p1.display();
}
}