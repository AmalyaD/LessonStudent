package guop1.Homework;

public class PracticeTest {
    public static void main(String[] args) {
        PracticeHomework test = new PracticeHomework();
        PracticeHomework test2 = new PracticeHomework();
        PracticeHomework arrays = new PracticeHomework();
        PracticeHomework arrays2 = new PracticeHomework();

        int[] arrayTest = {5,6,5,8,69,52, 8};
        int[] array1 = {56,60,2,89,79,65};

        test.convert(8);
        System.out.println("Seconds = " + test.convert(8));
        test2.convert(24);;

        test.calcAge(5);
        System.out.println("Days of year = " + test.calcAge(5));
        test2.calcAge(10);

        test.nextNumber(15);
        System.out.println("Next number is " + test.nextNumber(15));
        test2.nextNumber(56);

        test.isSameNum(6,20);
        System.out.println("It is " + test.isSameNum(6,20));
        test2.isSameNum(65,65);

        test.lessThanOrEqualToZero(-1);
        System.out.println("It is " + test.lessThanOrEqualToZero(-1));
        test2.lessThanOrEqualToZero(9);
        System.out.println("It is " + test.lessThanOrEqualToZero(9));

        test.reverseBool(true);
        System.out.println( test.reverseBool(true));

        int result = arrays.maxLength(arrayTest, array1);
        System.out.println( result);
    }
}
