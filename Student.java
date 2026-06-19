package Collections;

import java.util.*;

public class Student {
    public static void main(String[] args) {

        LinkedHashSet<String> registered = new LinkedHashSet<>();

        registered.add("Surekha");
        registered.add("Cherry");
        registered.add("Chinni");
        registered.add("Vijay");
        registered.add("Surekha"); 

        Queue<String> newS = new LinkedList<>();

        newS.add("Ram");
        newS.add("Kiran");
        newS.add("Surekha");

        System.out.println("Registered Students:");

        for(String s : registered) {
            System.out.println(s);
        }

        System.out.println("Unregistered Students:");

        for(String s : newS) {

            if(!registered.contains(s)) {
                System.out.println(s);
            }
        }
    }
}