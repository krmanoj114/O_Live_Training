package compare;

import org.junit.jupiter.api.Assertions;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toCollection;

public class JavaStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");
        //anyMatch
        boolean isExist = list.stream().anyMatch(element->element.contains("One"));
        System.out.println("isExist = " + isExist);

        Stream<String> stringStream = list.stream().filter(element -> element.contains("Thursday"));
        stringStream.forEach(System.out::println);

        list.stream().filter(element -> element.contains("Italy")).map(String::toUpperCase).forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);
        System.out.println("args = " + reduced);

        list.stream().map(e ->e.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

        //Stream of collection
        List<String> list1 = Arrays.asList("a", "b", "c");
        Stream<String> streamOfList = list1.stream();

        //An array can also be the source of a stream:
        Stream<String> streamOfArray = Stream.of("a", "b", "c");

        //We can also create a stream out of an existing array or of part of an array:
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> OfArrayPart = Arrays.stream(arr, 1, 3);

        //stream builder
        Stream<String> streamBuild = Stream.<String>builder().add("a").add("b").add("c").build();

        //Stream.generate()
        Stream.generate(()-> "element").limit(5).forEach(System.out::println);
        //Stream.iterate()
        Stream.iterate(5, n -> n+2).limit(10).forEach(System.out::println);

        //Stream of Primitives
        IntStream.range(1,9).forEach(System.out::println);
        LongStream.rangeClosed(5,10).forEach(System.out::println);
        DoubleStream limitDoubleStream = DoubleStream.iterate(10, n -> n + 1).limit(30);
        System.out.println("########################");
        limitDoubleStream.forEach(System.out::println);
        System.out.println("JavaStream.main");

        IntStream chars = "abc".chars();

        //Referencing a Stream
        /*Stream<String> stringStream1 = Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        stringStream1.findAny();
        stringStream1.findFirst();*/
        List<String> stringStream1 = Stream.of("a", "b", "c").filter(element -> element.contains("b")).collect(Collectors.toList());
        Optional<String> any = stringStream1.stream().findAny();
        Optional<String> first = stringStream1.stream().findFirst();

        //Stream pipeline
        Stream<String> onceModifiedStream =  Stream.of("abcd", "bbcd", "cbcd").skip(1);
        onceModifiedStream.forEach(System.out::println);

        List<String> list2 = Arrays.asList("abc1", "abc2", "abc3","zoopark", "mmmm", "xyz5");
        long size = list2.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted().count();
        System.out.println("size = " + size);
        List<String> collect = list2.stream()
                .skip(0)
                .map(element -> element.substring(0, 4))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("collect = " +collect);

        //reduce
        int[] numbers = {1, 4, 7, 2, 13, 8, 5};
        int sum = Arrays.stream(numbers).reduce(0, (x, y) -> (x + y));
        System.out.println("sum = " + sum);

        //Merginging stream
        Stream<Integer> stream1 = Stream.of(1, 3, 5);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);
        Stream<Integer> stream3 = Stream.of(18, 15, 36);
        Stream<Integer> stream4 = Stream.of(99);

        Stream<Integer> resultingStream = Stream.of(
                stream1, stream2, stream3, stream4)
                .flatMap(i ->i);

        Assertions.assertEquals(
                Arrays.asList(1, 3, 5, 2, 4, 6, 18, 15, 36, 99),
                resultingStream.collect(Collectors.toList()));
        //ArrayList
        List<Integer> list3 = new ArrayList<>(
                IntStream.range(0, 10).boxed().collect(toCollection(ArrayList::new))
        );
        List<Integer> result = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();
        ListIterator<Integer> integerListIterator = list3.listIterator(list3.size());
        while(integerListIterator.hasPrevious()){
            result.add(integerListIterator.previous());
        }
        while(integerListIterator.hasNext()){
            result1.add(integerListIterator.next());
        }

        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);


    }

}

