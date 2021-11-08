package lesson6;

public class IfElse {

    public static void main(String[] args) {

        int month = 4;//апрель
        String seasons;
        if (month == 12 || month == 1 || month == 2) {
            seasons = "зиме";
        }
        else if (month == 3 || month == 4 || month == 5) {
            seasons = "весне";
        }
        else if (month == 6 || month == 7 || month == 8){
            seasons = "лету";
        }
        else if (month == 9 || month == 10 || month == 11) {
            seasons = "осени";
        }
        else seasons="вымышленным месяцам";
        System.out.println("апрель относится к " + seasons + "");




    }

}