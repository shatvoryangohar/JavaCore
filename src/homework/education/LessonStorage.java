package homework.education;

public class LessonStorage {

    private Lesson[] lessons = new Lesson[10];
    private int size = 0;


    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;

    }

    public Lesson getByIndex(int index) {
        if (index < 0 || index > lessons.length) {
            System.err.println("invalid index");
            return null;
        }
        return lessons[index];
    }

    private void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            lessons[i - 1] = lessons[i];
        }
        size--;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }

    }

    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                return lessons[i];
            }
        }
        return null;
    }

    public void deleteLessonsByName(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].equals(lesson)) {
                delete(i);
                break;
            }
        }
    }
}
