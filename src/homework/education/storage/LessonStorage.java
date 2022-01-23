package homework.education.storage;

import homework.education.model.Lesson;

import java.util.LinkedList;
import java.util.List;

public class LessonStorage {

    //    private Lesson[] lessons = new Lesson[10];
//    private int size = 0;
    List<Lesson> lessonList = new LinkedList<>();

    public void add(Lesson lesson) {
        lessonList.add(lesson);
        //        if (lessons.length == size) {
//            extend();
//        }
        //    lessons[size++] = lesson;
    }

//    private void extend() {
//        Lesson[] tmp = new Lesson[lessons.length + 10];
//        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
//        lessons = tmp;
//
//    }

//    public Lesson getByIndex(int index) {
//        if (index < 0 || index > lessons.length) {
//            System.err.println("invalid index");
//            return null;
//        }
//        return lessons[i];
//    }

    private void delete(int index) {
        lessonList.remove(index);
        //        for (int i = index + 1; i <lessons.length; i++) {
//            lessons[i-1] = lessons[i];
//        }
//        size--;
    }

    public void print() {
        lessonList.toString();
//        for (int i = 0; i < size; i++) {
//            System.out.println(lessons[i]);
//        }

    }

    public Lesson getByName(String name) {
        for (int i = 0; i < lessonList.size(); i++) {
            if (lessonList.get(i).getName().equals(name)) {
                return lessonList.get(i);
            }
        }
        return null;
    }

    public void deleteLessonsByName(Lesson lesson) {
        for (int i = 0; i < lessonList.size(); i++) {
            if (lessonList.get(i).equals(lesson)) {
                delete(i);
                break;
            }
        }
    }
}
