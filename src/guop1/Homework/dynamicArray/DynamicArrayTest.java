package guop1.Homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray test = new DynamicArray();
        for (int i = 1; i < 15; i++) {
            test.add(i);
        }
        test.print();
     int c =   test.getByIndex(0);
        System.out.println(c);

    }
}
