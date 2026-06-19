import java.util.LinkedList;
//import java.util.List;
public class L{
    public static void main(String[] args){
        LinkedList<String> li=new LinkedList<>();
        li.add("Surekha");
        li.add("Cherry");
        li.add("vijay");
        System.out.println(li);
        li.remove("Surekha");
        //li.isEmpty();
        System.out.println(li);
        System.out.println(li.contains("Cherry"));
    }
}
