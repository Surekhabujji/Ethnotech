import java.util.*;
class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        for(int i=1;i<5;i++){
            System.out.println("Value");
            int a=sc.nextInt();
            if(a<c){
                c=a;
            }
        }
        System.out.println(c);
    }
}
