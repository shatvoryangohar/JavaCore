package lesson12;

public class Student {

    private String name;
    private String surName;
    private String phoneNumber;
    private int age;
    private String lessonName;


    public Student(String name, String surName, String phoneNumber, int age, String lessonName) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.lessonName = lessonName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}



