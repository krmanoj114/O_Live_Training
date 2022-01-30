package Collections;

import java.util.*;
import java.util.function.Consumer;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> mapLang = null;
        mapLang = new HashMap<>();
        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");

        System.out.println("mapLang = " + mapLang);
        Map<String, String> linkedHashMap = new LinkedHashMap<>(mapLang);
        linkedHashMap.put(null, null);
        System.out.println("linkedHashMap = " + linkedHashMap);
        Map<String, String> treeMap = new TreeMap<>(mapLang);
        //treeMap.put(null, null);
        System.out.println("treeMap = " + treeMap);

        //Get
        System.out.println(mapLang.get(".java"));

        //remove
        System.out.println("mapLang.remove(\".pl\") ::"+mapLang.remove(".pl"));

        //replace
        System.out.println(mapLang.replace(".cpp", "plainC"));

        boolean replace = mapLang.replace(".php", "PHP", "NEW PHP");
        System.out.println("replace = " + replace);
        System.out.println("mapLang = " + mapLang);
        System.out.println("##################################");
        //getting keySet and values

        Set<Map.Entry<String, String>> entries = mapLang.entrySet();
        Set<String> keys = mapLang.keySet();
        Collection<String> values = mapLang.values();
        System.out.println("entries = " + entries);
        System.out.println("keys = " + keys);
        System.out.println("values = " + values);

        //java8
        mapLang.forEach((key, value)-> System.out.println(key +"-->"+value));
        mapLang.keySet().stream().forEach(x -> System.out.println("x = " + x));
        mapLang.entrySet().stream().forEach((Consumer<? super Map.Entry<String, String>>) entr-> System.out.println(entr.getKey() +" ::"+ entr.getValue()));

        //synchronized
        Collections.synchronizedMap(mapLang);


    }

}
