import java.util.*;
class Person {
Scanner sc = new Scanner(System.in);
String name;
int id;
int tel, eng, maths, sci, soc;
void getdata() {
System.out.println("Enter Name:");
name = sc.nextLine();
System.out.println("Enter Id:");
id = sc.nextInt();
System.out.println("Enter 5 Subject Marks:");
        tel = sc.nextInt();
        eng = sc.nextInt();
        maths = sc.nextInt();
        sci = sc.nextInt();
        soc = sc.nextInt();
}
}

class Student extends Person {
void displayDetails() {
System.out.println("Name: " + name);
System.out.println("Id: " + id);
System.out.println("Telugu: " + tel);
System.out.println("English: " + eng);
System.out.println("Maths: " + maths);
System.out.println("Science: " + sci);
System.out.println("Social: " + soc);
}
}

class Result extends Student {
void calculate() {
int total = tel + eng + maths + sci + soc;
double avg = total / 5.0;
System.out.println("Total Marks: " + total);
System.out.println("Average Marks: " + avg);
}
}

class Multiple {
public static void main(String[] args) {
Result r = new Result();
r.getdata();
r.displayDetails();
r.calculate();
}
}