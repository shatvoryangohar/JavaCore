package homework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        long seconds = practiceHomework.convert(2);
        System.out.println(seconds);

        int days = practiceHomework.calcAge(3);
        System.out.println(days);

        int numbers = practiceHomework.nextNumber(52);
        System.out.println(numbers);


        boolean bul = practiceHomework.isSameNum(35, 54);
        System.out.println(bul);


        boolean a = practiceHomework.lessThanOrEqualToZero(65);
        System.out.println(a);


        int[] array = {54, 84, 12, 63, 4, 52, 74};
        int[] num = {42, 62, 34, 74, 10, 11};

        System.out.println(practiceHomework.maxLength(array,num));

    }

}
