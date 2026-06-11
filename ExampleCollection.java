package Collections;
import java.util.*;

class ExampleCollection {
    public  static void main(String[] args){
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println("This is for Set: "+s);
        System.out.println("============HAsh Set==============");
        HashSet<Integer> hs=new HashSet<>();
        hs.add(100);
        hs.add(101);
        hs.add(102);
        hs.add(103);
        System.out.println(hs);
        System.out.println(hs.contains(104));
        System.out.println(hs.remove(101));
        System.out.println(hs.isEmpty());

        LinkedHashSet<Integer> ll=new LinkedHashSet<>();
        for(Integer a:hs){
            ll.add(a);
        }
        System.out.println("Size of the Student: " + ll.size());
        System.out.println("To check it is empty: " + ll.contains(105));

        TreeSet<Integer> ts=new TreeSet<>();
        for(Integer v:hs){
            ts.add(v);
            
        }
        System.out.println("Tree Set: " + ts);
        System.out.println("First element in Set: " + ts.first());
        System.out.println("First element in Set: " + ts.last());


            
        


    }
    
}
