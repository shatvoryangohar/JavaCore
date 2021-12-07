package homework.education;

public interface StudentLessonCommands {
    String LOGIN = "1";
    String REGISTER = "2";
    String EXIT = "0";
    String ADD_LESSON = "3";
    String ADD_STUDENT = "4";
    String PRINT_STUDENTS = "5";
    String PRINT_LESSONS = "6";
    String PRINT_STUDENTS_BY_LESSON = "7";
    String DELETE_LESSONS_BY_NAME = "8";
    String DELETE_STUDENT_BY_EMAIL = "9";

    static void printCommands() {
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("lease input " + REGISTER + "for REGISTER");
        System.out.println("Please input " + EXIT + "for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + DELETE_LESSONS_BY_NAME + " for DELETE_LESSONS_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENTS_BY_EMAIL");
    }


    static void printUserCommands(){
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("lease input " + REGISTER + "for REGISTER");
        System.out.println("Please input " + EXIT + "for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
    }
}
