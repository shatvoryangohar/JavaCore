package homework.education.storage;

import homework.education.model.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentStorage {

     // private Student[] students = new Student[10
    List<Student> list = new LinkedList<>();

    public void add(Student student) {
        list.add(student);
//        if (students.length == size) {
//            extend();
//        }
        //       students[size++] = student;
    }

//    private void extend() {
//        Student[] array = new Student[students.length + 10];
//        System.arraycopy(students, 0, array, 0, students.length);
//        students = array;
//    }
//
//    public Student getByIndex(int index) {
//        if (index < 0 || index > students.length) {
//            System.err.println("invalid index");
//            return null;
//        }
//        return students[index];
//    }

    public void print() {
        list.toString();
        //        for (int i = 0; i < size; i++) {
//            System.out.println(students[i]);
//        }
    }

    private void delete(int index) {
        list.remove(index);

    }

    public Student getByEmail(String email) {
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).getEmail().equals(email)) {
                return list.get(i);
            }
        }
        return null;
    }


    public void deleteStudentByEmail(Student student) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(student)) {
                delete(i);
            }
        }

    }
}
