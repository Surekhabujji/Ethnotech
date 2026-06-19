import java.util.*;
class D{
public static void main(String[] args){
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("Enter 2 values: ");
a=s.nextInt();
b=s.nextInt();
int diff=a-b;
if(diff>0){
System.out.println("Positive");
}
else{
System.out.println("Negative");
}
}
}
