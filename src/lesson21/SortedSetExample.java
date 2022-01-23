package lesson21;

import java.util.*;

public class SortedSetExample {

    public static void main(String[] args) {

//        Set<Student> studentSet = new TreeSet<>();
//        Student student = new Student("poxos", "poxosyan", 14, "poxos@mail.com");
//        Student student1 = new Student("arto", "poxosyan", 12, "arto@mail.com");
//    studentSet.add(student);
//    studentSet.add(student1);
//        for (Student st : studentSet) {
//            System.out.println(st);
//        }

        List<Student> studentList = new ArrayList<>();
        Student student = new Student("poxos", "poxosyan", 16, "poxos@mail.com");
        Student student1 = new Student("arto", "poxosyan", 14, "arto@mail.com");
        studentList.add(student);
        studentList.add(student1);
        //  Collections.sort(studentList);
        Collections.sort(studentList, new StudentAgeComparator());
        for (Student st : studentList) {
            System.out.println(st);
        }
    }
}
