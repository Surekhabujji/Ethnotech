import java.util.*;
class Person {
Scanner sc = new Scanner(System.in);
String empname;
int empid;
double salary;
double hra,da,ta,pf,it;
void getdata() {
System.out.println("Enter EmpName:");
empname = sc.nextLine();
System.out.println("Enter EmpId:");
empid = sc.nextInt();
System.out.println("Enter Basic Salary:");
salary = sc.nextDouble();
hra=salary*0.10;
da=salary*0.8;
ta=salary*0.6;
pf=salary*0.3;
it=salary*0.2;

}
}

class Employee extends Person {
void displayDetails() {
System.out.println("HRA: " + hra);
System.out.println("DA: " + da);
System.out.println("TA: " + ta);
System.out.println("PF: " + pf);
System.out.println("IT: " + it);
System.out.println("Name: " + empname);
System.out.println("Id: " + empid);
System.out.println("Basic salary: " + salary);
}
}

class Bonus extends Employee {
void calculate() {
double hra=salary*0.10;
double da=salary*0.8;
double ta=salary*0.6;
double pf=salary*0.3;
double it=salary*0.2;
double gross=salary+hra+da+ta;
double deduction = pf + it;
double net = gross - deduction; 
System.out.println("Gross Salary: " + gross);
System.out.println("Net Salary: " + net);
System.out.println("Deduction: " + deduction);
}
}

class Multilevel1{
public static void main(String[] args) {
Bonus b = new Bonus();
b.getdata();
b.displayDetails();
b.calculate();
}
}