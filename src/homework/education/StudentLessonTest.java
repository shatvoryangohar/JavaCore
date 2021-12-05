package homework.education;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class StudentLessonTest implements StudentLessonCommands {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();


    public static void main(String[] args) throws ParseException {

        Lesson qimia = new Lesson("qimia", 45, "tjycjtc", 45);
        Lesson matem = new Lesson("matem", 45, "tjycjtc", 45);
        lessonStorage.add(qimia);
        lessonStorage.add(matem);

        Lesson lesson1 = new Lesson("ddddd", 78, "jjjj", 65);
        Lesson[] lessons = new Lesson[1];
        lessonStorage.add(lesson1);
        lessons[0] = lesson1;
        studentStorage.add(new Student("Poxos", "Poxosyan", 16, "poxos@gmail.com", "093154654", lessons, DateUtil.stringToDate("24/08/2012")));
        boolean isFound = true;
        while (isFound) {
            StudentLessonCommands.printCommands();
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
        } else {
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

    private static void addStudent() throws ParseException {

        System.out.println("please input student's name,surname,age,email,phone,lesson name,dateOfBirth");
        String studentData = scanner.nextLine();
        String[] studentDataStr = studentData.split(",");
        if (studentDataStr.length == 7) {
            int age = Integer.parseInt(scanner.nextLine());
            String lessonNames = scanner.nextLine();
            Date data = DateUtil.stringToDate(studentDataStr[6]);
            String[] namesSplitted = lessonNames.split(",");
            Lesson[] lessons = new Lesson[namesSplitted.length];
            for (int i = 0; i < namesSplitted.length; i++) {
                Lesson lesson = lessonStorage.getByName(namesSplitted[i]);
                if (lesson != null) {
                    lessons[i] = lesson;

                }
                Student student = new Student(studentDataStr[0], studentDataStr[1], age, studentDataStr[3], studentDataStr[4], lessons, data);
                if (studentStorage.getByEmail(student.getEmail()) != null) {
                    System.out.println("Invalid email!Student with email already exists");

                }
                studentStorage.add(student);
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


}
