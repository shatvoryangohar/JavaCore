package homework;

public class PracticeHomework {

    long seconds = 60;

    long convert(int minutes) {
        return seconds * minutes;
    }

    int days = 365;

    int calcAge(int years) {
        return years * days;
    }


    int nextNumber(int number) {
        return number - 1;
    }


    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else return false;
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else {
            return false;
        }

    }


    int maxLength(int[] array1, int[] array2){

if (array1.length>array2.length){
    return array1.length;
}else return array2.length;
    }

}
