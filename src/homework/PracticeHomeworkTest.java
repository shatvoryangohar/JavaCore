package homework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        System.out.println(practiceHomework.convert(2));

        System.out.println(practiceHomework.calcAge(3));


        System.out.println(practiceHomework.nextNumber(52));


        System.out.println(practiceHomework.isSameNum(35, 54));


        System.out.println(practiceHomework.lessThanOrEqualToZero(65));


        System.out.println(practiceHomework.reversBool(true));

        int[] array = {54, 84, 12, 63, 4, 52, 74};
        int[] num = {42, 62, 34, 74, 10, 11};

        System.out.println(practiceHomework.maxLength(array,num));

    }

}
