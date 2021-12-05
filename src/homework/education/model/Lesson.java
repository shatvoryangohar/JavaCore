package homework.education.model;

public class Lesson {

    private String name;
    private double duration;
    private String lecturerName;
    private double price;

    public Lesson() {
    }

    public Lesson(String name, double duration, String lecturerName, double price) {
        this.name = name;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (Double.compare(lesson.duration, duration) != 0) return false;
        if (Double.compare(lesson.price, price) != 0) return false;
        if (name != null ? !name.equals(lesson.name) : lesson.name != null) return false;
        return lecturerName != null ? lecturerName.equals(lesson.lecturerName) : lesson.lecturerName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (lecturerName != null ? lecturerName.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                '}';
    }
}
