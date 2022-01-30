package comparator;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

    private String name;

    public Test(String name) {
        this.name = name;


    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println();
            System.out.println("Test.main");
            System.out.println("args = " + Arrays.deepToString(args));

            System.out.println("i = " + i);
            System.err.println();
            List<String> ls = Arrays.asList("Mohar", "Shohan", "Rohan");

            for (Iterator<String> iterator = ls.iterator(); iterator.hasNext(); ) {
                String next =  iterator.next();

            }
            new File(".").isHidden();

        }
    }


}
