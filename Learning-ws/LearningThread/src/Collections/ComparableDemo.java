package Collections;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ComparableDemo {


    public static void main(String[] args) {

        List<Employee> listEmployees = new ArrayList<>();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Employee employee1 = null;
        Employee employee2 = null;
        Employee employee3 = null;
        Employee employee4 = null;
        Employee employee5 = null;
        try {
            employee1 = new Employee("Tom", "Eagar", dateFormat.parse("2007-12-03"));
            employee2 = new Employee("Tom", "Smith", dateFormat.parse("2005-06-20"));
            employee3 = new Employee("Bill", "Joy", dateFormat.parse("2009-01-31"));
            employee4 = new Employee("Bill", "Aates", dateFormat.parse("2005-05-12"));
            employee5 = new Employee("Alice", "Wooden", dateFormat.parse("2009-01-22"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);
        listEmployees.add(employee4);
        listEmployees.add(employee5);

        System.out.println("Before shorting");
        listEmployees.forEach(System.out::println);

        //Collections.sort(listEmployees, new EmployeeComparator());

        System.out.println("After shorting");
        //Multiple field comparison using java8
        listEmployees.stream().sorted(Comparator.comparing(Employee::getJoinDate)
                .thenComparing(Employee::getLastName)
                .thenComparing(Employee::getFirstName))
                .forEach(System.out::println);




        //listEmployees.forEach(System.out::println);


    }
}
