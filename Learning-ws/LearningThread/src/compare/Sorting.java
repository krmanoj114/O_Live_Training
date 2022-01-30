package compare;


import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Sorting {

    int[] toSort = new int[]{5, 1, 89, 255, 7, 88, 200, 123, 66};
    int[] sortedInts = new int[]{1, 5, 7, 66, 88, 89, 123, 200, 255};
    int[] sortedRangeInts = new int[]{5, 1, 89, 7, 88, 200, 255, 123, 66};

    public static void main(String[] args) {


        int[] toSort = new int[]
                {5, 1, 89, 255, 7, 88, 200, 123, 66};

        System.out.println("toSort before = " + Arrays.toString(toSort));
        Arrays.sort(toSort);
        System.out.println("toSort after = " + Arrays.toString(toSort));
    }

    @Test
    public void givenIntArray_whenUsingSort_thenSortedArray() {
        Arrays.sort(toSort);
        assertTrue(Arrays.equals(toSort, sortedInts));
    }

    //Sorting Part of an Array
    @Test
    public void givenIntArray_whenUsingRangeSort_thenRangeSortedArray() {
        Arrays.sort(toSort, 3, 7);
        assertTrue(Arrays.equals(toSort, sortedRangeInts));
    }

    //Java 8 Arrays.sort vs Arrays.parallelSort
    @Test
    public void givenIntArray_whenUsingParallelSort_thenArraySorted() {
        Arrays.parallelSort(toSort);
        assertTrue(Arrays.equals(toSort, sortedInts));
    }

    // Sorting a List
    @Test
    public void givenList_whenUsingSort_thenSortedList() {
        List<Integer> toSortList = Arrays.stream(toSort).boxed().collect(Collectors.toList());
        List<Integer> sortedInts12 = Arrays.stream(sortedInts).boxed().collect(Collectors.toList());
        Collections.sort(toSortList);

        assertTrue(Arrays.equals(toSortList.toArray(), sortedInts12.toArray()));
    }

    // Sorting a Set
    @Test
    public void givenSet_whenUsingSort_thenSortedSet() {
        Set<Integer> integersSet = new LinkedHashSet<>(
                Arrays.asList(new Integer[]
                        {5, 1, 89, 255, 7, 88, 200, 123, 66}));
        Set<Integer> descSortedIntegersSet = new LinkedHashSet<>(
                Arrays.asList(new Integer[]
                        {255, 200, 123, 89, 88, 66, 7, 5, 1}));

        List<Integer> list = new ArrayList<Integer>(integersSet);
        Collections.sort(list, Comparator.reverseOrder());
        integersSet = new LinkedHashSet<>(list);
        System.out.println("sorted =" + list);
        assertTrue(Arrays.equals(
                integersSet.toArray(), descSortedIntegersSet.toArray()));
    }

    //Sorting Map
    @Test
    public void givenMap_whenSortingByKeys_thenSortedMap() {
        Integer[] sortedKeys = new Integer[] { 6, 12, 22, 55, 66, 77 };
        HashMap<Integer, String> map = new HashMap<>();
        map.put(55, "John");
        map.put(22, "Apple");
        map.put(66, "Earl");
        map.put(77, "Pearl");
        map.put(12, "George");
        map.put(6, "Rocky");

        List<Map.Entry<Integer, String>> entries
                = new ArrayList<>(map.entrySet());
        Collections.sort(entries, Comparator.comparing(Map.Entry::getKey));
        /*Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Based on key ="+sortedMap.keySet());

        assertTrue(Arrays.equals(sortedMap.keySet().toArray(), sortedKeys));
    }

    @Test
    public void givenMap_whenSortingByValues_thenSortedMap() {
        String[] sortedValues = new String[]
                { "Apple", "Earl", "George", "John", "Pearl", "Rocky" };
        HashMap<Integer, String> map = new HashMap<>();
        map.put(55, "John");
        map.put(22, "Apple");
        map.put(66, "Earl");
        map.put(77, "Pearl");
        map.put(12, "George");
        map.put(6, "Rocky");

        List<Map.Entry<Integer, String>> entries
                = new ArrayList<>(map.entrySet());

        Collections.sort(entries, Comparator.comparing(Map.Entry::getValue));

        /*Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(
                    Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });*/
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Based on kevaluey ="+sortedMap.values());
        assertTrue(Arrays.equals(sortedMap.values().toArray(), sortedValues));
    }
        //use a custom Comparator with the sorted() API:
    @Test
    public final void
    givenStreamCustomOrdering_whenSortingEntitiesByName_thenCorrectlySorted() {
        List<Player> humans = Arrays.asList(new Player(59, "Zoker", 20), new Player(67, "Roger", 22), new Player(45, "Steven", 24));
        Comparator<Player> nameComparator = (h1, h2) -> h1.getName().compareTo(h2.getName());

        List<Player> sortedHumans = humans.stream().sorted(nameComparator).collect(Collectors.toList());
        System.out.println(" ="+sortedHumans);
        //assertThat(sortedHumans.get(0), equalTo(new Player(59, "ACE", 20)));
    }


}
