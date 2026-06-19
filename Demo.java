import java.util.*;
class Demo{
Scanner sc = new Scanner(System.in);
int a,b,c;
void input(){
System.out.println("Two values:");
int a =sc.nextInt();
int b =sc.nextInt();
}
void sum(){
c =a+b;
}
void output(){
System.out.println("Sum: " + c);
}

public static void main(String[] args) {
Demo d1 = new Demo();
Demo d2=new Demo();
d1.input();
d2.input();
d1.sum();
d2.sum();
d1.output();
d2.output();
}
}


