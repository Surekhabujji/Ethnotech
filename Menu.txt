import java.util.*;
class Menu{
int a,result;
void input(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value:");
a=sc.nextInt();
}
void count(){
int t=a,c=0;
while(t>0){
c++;
t=t/10;
}
result=c;
}
void reverse(){
int t=a,rev=0;
while(t>0){
int d=t%10;
rev=rev*10+d;
t=t/10;
}
result=rev;
}
void strong(){
int temp=a,org=a,sum=0;
while(temp>0){
int dig=temp%10;
int f=1;
for(int i=1;i<=dig;i++){
f=f*i;
}
sum=sum+f;
temp=temp/10;
}
if(sum==org){
System.out.println("Strong Number");
}
else{
System.out.println("Not Strong Number");
}
}
void auto(){
int sq=a*a;
if(sq%10==a%10){
System.out.println("Automorphic Number");
}
else{
System.out.println("Not Automorphic Number");
}
}
void output(){
System.out.println("Result:"+result);
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
Menu s1=new Menu();
int ch=0;
while(ch!=5){
System.out.println("MENU");
System.out.println("1.Count");
System.out.println("2.Reverse");
System.out.println("3.Strong");
System.out.println("4.Automorphic");
System.out.println("5.Exit");
System.out.println("Enter choice:");
ch=s.nextInt();
if(ch>=1&&ch<=4){
s1.input();
switch(ch){
case 1:s1.count();
s1.output();
break;
case 2:s1.reverse();
s1.output();
break;
case 3:s1.strong();
break;
case 4:s1.auto();
break;
}
}
else if(ch==5){
System.out.println("Program over");
}
else{
System.out.println("Try again");
}
}
}
}