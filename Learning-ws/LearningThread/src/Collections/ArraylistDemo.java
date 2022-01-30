package Collections;

import compare.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("Four");
        System.out.println(listStrings);
        System.out.println("################################");
        listStrings.forEach(System.out::println);
        System.out.println("################################");
        listStrings.forEach(x -> System.out.println(x));
        System.out.println("################################");
        for (String listString : listStrings) {
            System.out.println(listString);
        }

        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);
        var player = new ArrayList<Player>();
        player.add(new Player(1, "Manoj", 25));

        List<String> listNames = Arrays.asList("Tom", "John", "Mary", "Peter", "David", "Alice");
        System.out.println("Original list: " + listNames);
        List<String> subList = listNames.subList(2, 5);
        listNames.set(4, "MMMMMMM");//Note that the sub list is just a view of the original list, so any modifications made on the original list will reflect in the sub list.
        System.out.println("Sub list: " + subList);


        List<String> listNamess = Arrays.asList("John", "Peter", "Tom", "Mary", "David", "Sam");
        List<Integer> listNumberss = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
        listNamess.set(1, "mmmm");
        //listNumberss.add(9);
        System.out.println(listNamess);
        System.out.println(listNumberss);

        List<String> listWords = new ArrayList<String>();
        String[] words = listWords.toArray(new String[2]);
        words[1] = "Apple";

        //List useful method
        listWords.add("manoj");
        listWords.addAll(listNames);
        listWords.contains("manoj");
        listWords.containsAll(listNames);
        listWords.get(1);
        listWords.indexOf("manoj");
        listWords.lastIndexOf("Tom");
        listWords.remove(2);
        listWords.set(4, "Mango");
        Iterator<String> iterator = listWords.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.hasNext() = " + iterator.next());
        }
        List<String> strings = listWords.subList(0, 4);
        int size = listWords.size();
        boolean empty = listWords.isEmpty();
        listWords.clear();


    }
}
