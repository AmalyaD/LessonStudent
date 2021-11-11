package BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String string = "(Hello) [ [(from)} ]{Java}";
     //   char [] chars = text.toCharArray();

        BraceChecker str = new BraceChecker(string);
        str.check();


    }
}
