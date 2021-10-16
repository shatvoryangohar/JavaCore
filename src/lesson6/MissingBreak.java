package lesson6;

public class MissingBreak {

    public static void main(String[] args) {

        for (int i = 0; i < 12; i++) {

            switch (i) {

                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i меньше 5");
                    break;

                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i меньше 10");
                    break;
                default:
                    System.out.println("i равно или больше 10");

            }

        }

        int month = 4;
        String seasons;

        switch (month) {

            case 12:
            case 1:
            case 2:
                seasons = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                seasons = "весне";
                break;

            case 6:
            case 7:
            case 8:
                seasons = "лету";
                break;
            case 9:
            case 10:
            case 11:
                seasons = "осени";
                break;
            default:
                seasons = "вымышленным месяцам";

        }
                System.out.println("Апрель относится к " + seasons+ "");

    }

}
