import java.util.*;

class E3 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter sub1 marks:");
int sub1 = sc.nextInt();
System.out.println("Enter sub2 marks:");
int sub2 = sc.nextInt();
System.out.println("Enter sub3 marks:");
int sub3 = sc.nextInt();
System.out.println("Enter sub4 marks:");
int sub4 = sc.nextInt();
int total = sub1 + sub2 + sub3 + sub4;
int avg = total / 4;
if ((sub1 >= 35) && (sub2 >= 35) && (sub3 >= 35) && (sub4 >= 35)) {
System.out.println("Pass");
            if (avg >= 90) {
                System.out.println("Grade: A");
            }
            else if (avg >= 70) {
                System.out.println("Grade: B");
            }
            else if (avg >= 50) {
                System.out.println("Grade: C");
            }
            else {
                System.out.println("Grade: D");
            }

        }
else {
     System.out.println("Fail");
     }
   }
}