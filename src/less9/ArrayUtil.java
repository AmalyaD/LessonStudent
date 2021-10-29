package less9;

public class ArrayUtil {
    //  Տպել մասիվի բոլոր էլեմենտները

    int[] intArray;
    int max = 0;

    void printNum(){
        for (int i = 1; i < intArray.length; i++) {

            //  Տպել մասիվի բոլոր էլեմենտները
            System.out.print(intArray[i] + " ");
        }
    }
  //  System.out.println();

    //  Տպել մասիվի ամենամեծ թիվը

    void getMax() {
        max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];

            }
        }
        System.out.println("max = " + max);
        System.out.println();

    }
    int min = 0;
    void minNum(){
        min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        } System.out.println("min = " + min);
        System.out.println();

    }
    //  Տպել մասիվի բոլոր զույգ էլեմենտները,

    void getEven(){
        System.out.println("Even numbers");
        int count1 = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                count1++;
                System.out.println(intArray[i] + " ");
            }
        } System.out.println("Count of even numbers is " + count1);
        System.out.println();
    }
    void getOdd(){
        System.out.println("Odd numbers ");
        int count2 = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0){
                count2++;
                System.out.print( intArray[i] + " ");
            }
        }  System.out.println("Count of odd numbers is " + count2);
        System.out.println();
    }
    //    Տպեք մասիվի էլեմենտների գումարը
    void elementSum(){
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];

        }  System.out.println( "Sum = " + sum);
        System.out.println();
    }
    void average() {
        int sum = 0;
        int count = 1;
        int average = 0;
        for (int i = 0; i < intArray.length; i++) {
            count++;
            sum += intArray[i];
            average = sum / count;
        } System.out.println("Average = " + average);
    }
}
