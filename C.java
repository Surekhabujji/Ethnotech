import java.util.*;
class C{
public static void main(String[] args){
String name;
int id;
int t,e,m,s,ss;
Scanner sc=new Scanner(System.in);
System.out.println("Enter all values");
name=sc.nextLine();
id=sc.nextInt();
t=sc.nextInt();
e=sc.nextInt();
m=sc.nextInt();
s=sc.nextInt();
ss=sc.nextInt();
int totalmarks=t+e+m+s+ss;
int avg=totalmarks/5;
System.out.println("total:"+totalmarks);
System.out.println("avg:"+avg);
}
}




