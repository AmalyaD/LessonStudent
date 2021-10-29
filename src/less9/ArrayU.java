package less9;

import java.util.Arrays;



public class ArrayU {
    public static void main(String[] args) {
        int[] arrayNum = {2,56,8,15,59,84,72,42,31,25};
        int[] array2 = {5, 62, 98, 56, 54};

        ArrayUtil arrayN = new ArrayUtil();
        ArrayUtil arrayUtil = new ArrayUtil();

        arrayUtil.intArray = arrayNum;
        arrayUtil.printNum();
        arrayUtil.getMax();
        arrayUtil.minNum();
        arrayUtil.getOdd();
        arrayUtil.getEven();
        arrayUtil.elementSum();
        arrayUtil.average();

        arrayN.intArray = array2;
        arrayN.printNum();
        arrayN.getMax();
        arrayN.minNum();
        arrayN.elementSum();
        arrayN.getEven();
        arrayN.getOdd();
        arrayN.average();

    }
}
