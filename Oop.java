import java.util.*;
class Oop
{
Scanner sc=new Scanner(System.in);
int a,b,c;
void input(){
System.out.println("Enter 2 values: ");
a=sc.nextInt();
b=sc.nextInt();
}
void sum(){
c=a+b;
}
void output(){
System.out.println("Sum: "+c);
}
public static void main(String args[]){
Oop d =new Oop();
d.input();
d.sum();
d.output();
}
}



