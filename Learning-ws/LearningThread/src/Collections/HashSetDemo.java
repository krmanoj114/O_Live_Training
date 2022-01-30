package Collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");
        names.add(null);
        names.forEach(x -> System.out.println(x));

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("next = " + next);
        }
        //Removing duplicate entries
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println(uniqueNumbers);

        Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
        if (s1.containsAll(s2)) {
            System.out.println("s2 is a subset of s1");
        }
    }
}
