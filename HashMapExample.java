import java.util.*;
public class HashMapExample {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Akhila");
        hashMap.put("2", "Pagundla");
        hashMap.put("1", "Akhila");
        hashMap.put("3", "Akhi");
        System.out.println(hashMap);
        System.out.println(hashMap.get("1"));
        System.out.println(hashMap.get("2"));
        System.out.println(hashMap.remove("3"));
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey("1"));
        System.out.println(hashMap.containsValue("Akhila"));
        HashMap<String,Integer> h = new HashMap<>();
        h.put("1", 1);
        h.put("1", 2);
        h.put("3", 3);
        h.put("1", 4);
        h.put("1", 5);
        System.out.println(h);
        LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
        lh.put("1", 1);
        lh.put("2", 2);
        lh.put("3", 3);
        lh.put("4", 4);
        lh.put("15", 5);
        System.out.println(lh);
    }
    
}
