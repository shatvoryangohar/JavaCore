package lesson9.figurePainter;

public class FigurePainterTest {

    public static void main(String[] args) {


        FigurePainter fp = new FigurePainter();

        fp.figureOne(5, '*');
        fp.figureOne(4, '?');
        fp.figureOne(9, '$');
        fp.figureOne(3, '&');


        fp.figureTwo();

        fp.figureThree();
        fp.figureFour();
        fp.figureFive();

    }


}
