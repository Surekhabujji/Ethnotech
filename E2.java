import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        System.out.println("Enter number");
        b=sc.nextInt();
        System.out.println("Enter number");
        c=sc.nextInt();
        if(a==b||b==c||a==c){
            System.out.println("Same number");
        }
        else{
            System.out.println("Different number");
        }

    }
}
