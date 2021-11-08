package lesson12;

public class StudentTest {

    public static void main(String[] args) {

        Student poxos = new Student("Poxos", "Poxosyan", "09342185", 16, "java");
        System.out.println(poxos.getName());

        poxos.setName("poxosik");
        System.out.println(poxos.getName());
        System.out.println(poxos.getLessonName());
        System.out.println(poxos.getAge());
        System.out.println(poxos.getSurName());
        System.out.println(poxos.getPhoneNumber());
    }
}
