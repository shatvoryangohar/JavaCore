package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        String text = "hello (from} java";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }
}
