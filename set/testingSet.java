package set;

import java.util.HashSet;
import java.util.Set;

import queue.utility;

public class testingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Heet Nandu"));
        System.out.println(names.add("Batman"));
        System.out.println(names.add("maxing"));
        utility.print(names);

        System.out.println(names.add("Heet Nandu"));
        System.out.println(names.size());
        utility.print(names);
    }
}


