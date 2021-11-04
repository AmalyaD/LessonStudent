package guop1.Homework.dynamicArray;

public class DynamicArray {

    // sa mer himnakan masivn e vortex pahvelu en avelacnox  elementrey
    private int[] array = new int[10];

    // sa mer masivi mej avelacvac elementneri qankn e
    private int size = 0;

    // stugel ete masivi mej tex chka-, kanchel extend()
    // ev avelacnenq

    public void add(int value) {
        if (size == array.length-1) {
            extend();
        }
        array[size++] = value;

    }

    // stexcel hin masivic tas element aveli mec masiv
    // qcel hin masivi elementnery nori mej
    // hin masivi hxumy kapenq nor masivi hxman het

    private void extend() {
        int array1[] = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;


    }
    // ete trvac indeqsy mer unecac  masivi indeqsi sahmannerum e, veradarcnel masivi index-erord elementy,
    // hakarak depqum -1

    public int getByIndex(int index) {

            if((index >= 0) && (index < array.length)){
                return  array[index];
            }
       return -1;
    }
//
//    // tpel masivi avelacvac elementnery
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }

}
