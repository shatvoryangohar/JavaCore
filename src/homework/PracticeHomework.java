package homework;

public class PracticeHomework {


    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել

    //  long seconds = 60;

    //  long convert(int minutes) {
    //     return seconds * minutes;
    // }

    long convert(int minutes) {
        return minutes * 60;
    }

// ընդունել տարին,վերադարձնել օրերի քանակը։
    //  int days = 365;

    //   int calcAge(int years) {
    //      return years * days;
    // }

    int calcAge(int years) {
        return years * 365;
    }
//վերադարձնել տրված թվի հաջորդ թիվը։

    int nextNumber(int number) {

        return number + 1;
    }

    //վերադարձնել true,եթե տրված a և b թվերը իրար հավասար են,եթե ոչ՝ false:

    //   boolean isSameNum(int a, int b) {
    //   if (a == b) {
    //          return true;
    //    } else return false;
    //  }

    boolean isSameNum(int a, int b) {
        return a == b;
    }

//վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
//    boolean lessThanOrEqualToZero(int number) {
//        if (number <= 0) {
//            return true;
//        } else {
//            return false;
//        }

    //   }


    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }

//վերադարձնել ընդունող բուլյանի ժխտված արժեքը։

    boolean reversBool(boolean value) {
        return !value;
    }

//վերադարձնել երկու մասիվի ամենամեծ length-ը։

    //   int maxLength(int[] array1, int[] array2) {

    //      if (array1.length > array2.length) {
    //          return array1.length;
    //      } else return array2.length;
    //  }

    //    }


    int maxLength(int[] array1, int[] array2) {


        return array1.length > array2.length ? array1.length : array2.length;


    }
}