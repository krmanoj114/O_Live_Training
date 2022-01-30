import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class SecretOfFastestDevelopmentIntellij {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        numbers.forEach(n -> System.out.println(n));



        long t0 = System.currentTimeMillis();
        List<Integer> results = numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number)
                .collect(Collectors.toList());
        //Thread.sleep(10000);
        long t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);


        long t2 = System.currentTimeMillis();

        for (Integer number : numbers) {
            if (number % 2 == 1) {
                Integer integer = number * number;
                results.add(integer);
            }
        }
        long t3 = System.currentTimeMillis();
        System.out.printf("My result =%, d%n", t3 - t2);

        //region Description
        Person person = new Person();
        String phoneNumberHome = person.getPhoneNumberHome();

        String address = person.getAddress();


        String firstName = person.getLastName();
        //endregion
        manoj(person.getFirstName());







    }

    public static void manoj(String name) {

    }
}
