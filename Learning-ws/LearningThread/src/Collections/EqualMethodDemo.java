package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualMethodDemo {
    public static void main(String[] args) {
        Student student1 = new Student("123", "Tom", "tom@gmail.com", 30);
        Student student2 = new Student("123", "Tom", "tom@gmail.com", 30);
        Student student3 = new Student("456", "Peter", "peter@gmail.com", 23);

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        /*Student searchStudent1 = new Student("123");
        Student searchStudent4 = new Student("789");

        boolean found1 = listStudents.contains(searchStudent1);
        boolean found4 = listStudents.contains(searchStudent4);

        System.out.println("Found student1: " + found1);
        System.out.println("Found student4: " + found4);*/

        Set<Student> setStudents = new HashSet<Student>();

        setStudents.add(student1);
        setStudents.add(student2);
        setStudents.add(student3);
        System.out.println("student1 = " + student1.hashCode());
        System.out.println("student2 = " + student2.hashCode());
        System.out.println("student3 = " + student3.hashCode());
        setStudents.forEach(student -> System.out.println(student));

        Student searchStudent = new Student("456");
        boolean found = setStudents.contains(searchStudent);
        System.out.println("Found student: " + found);

    }
}
