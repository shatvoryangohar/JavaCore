package homework.education;

import java.util.Scanner;

public class StudentLessonTest {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_LESSONS = "4";
    private static final String PRINT_STUDENTS_BY_LESSON = "5";
    private static final String DELETE_LESSONS_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    public static void main(String[] args) {
        Lesson lesson = new Lesson("qimia", 60, "poxos", 120);
        lessonStorage.add(new Lesson("qimia", 60, "poxos", 120));
        studentStorage.add(new Student("poxos", "poxosyan", 16, "poxos@gmail.com", "093454645", lesson));
        boolean isFound = true;
        while (isFound) {
            printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isFound = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case DELETE_LESSONS_BY_NAME:
                    deleteLessonsByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
            }


        }


    }

    private static void deleteStudentByEmail() {
        System.out.println("please choose student's email");
        studentStorage.print();
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
        studentStorage.deleteStudentByEmail(student);
        }else{
            System.out.println("Students does not exists");
        }
    }

    private static void deleteLessonsByName() {
        System.out.println("please choose lesson's name ");
        lessonStorage.print();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteLessonsByName(lesson);
        } else {
            System.out.println("lesson does not exists");
        }
    }

    private static void printStudentsByLesson() {
        System.out.println("please choose lesson's name ");
        lessonStorage.print();
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonName);
        if (lessonStorage.getByName(lesson.getName()) != null) {
            studentStorage.print();
        } else {
            System.out.println("Invalid name!");
        }
    }

    private static void addStudent() {
        System.out.println("please choose lesson's name ");
        lessonStorage.print();
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonName);
        if (lesson != null) {
            System.out.println("please input student's name");
            String name = scanner.nextLine();
            System.out.println("please input student's surname");
            String surname = scanner.nextLine();
            System.out.println("please input student's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input student's email");
            String email = scanner.nextLine();
            System.out.println("please input student's phone");
            String phone = scanner.nextLine();
            Student student = new Student(name, surname, age, email, phone, lesson);
            if (studentStorage.getByEmail(student.getEmail()) != null) {
                System.out.println("Invalid email!Student with email already exists");
            } else {
                addStudent();
            }
        }
    }

    private static void addLesson() {
        System.out.println("please input lesson's name");
        String name = scanner.nextLine();
        System.out.println("please input lesson's duration");
        double duration = Double.parseDouble(scanner.nextLine());
        System.out.println("please input lesson's lecturerName");
        String lecturedName = scanner.nextLine();
        System.out.println("please input lesson's price");
        double price = Double.parseDouble(scanner.nextLine());
        Lesson lesson = new Lesson(name, duration, lecturedName, price);
        if (lessonStorage.getByName(lesson.getName()) != null) {
            System.out.println("Invalid name!lesson with name already exists ");
        } else {
            addLesson();
            System.out.println("Thanks!Lessons was added");
        }

    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + "for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + DELETE_LESSONS_BY_NAME + " for DELETE_LESSONS_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENTS_BY_EMAIL");
    }
}
