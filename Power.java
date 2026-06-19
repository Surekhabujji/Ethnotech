import java.util.*;
class Power{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter meter no:");
int mno=sc.nextInt();
System.out.println("enter customer name:");
String s=sc.next();
System.out.println("last month reading:");
int l=sc.nextInt();
System.out.println("present month reading:");
int p=sc.nextInt();
System.out.println("enter unit rate:");
double ur=sc.nextDouble();
int units=p-l;
double Bamount=units*ur;
System.out.println("units:"+units);
System.out.println("Bamount:"+Bamount);
}
}