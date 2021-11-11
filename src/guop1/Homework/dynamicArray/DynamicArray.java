//package guop1.Homework.dynamicArray;
//
//public class DynamicArray {
//
//    // sa mer himnakan masivn e vortex pahvelu en avelacnox  elementrey
//    private int[] array = new int[10];
//
//    // sa mer masivi mej avelacvac elementneri qankn e
//
//
//    // stugel ete masivi mej tex chka-, kanchel extend()
//    // ev avelacnenq
//
//    public void add(int value) {
//        if (size == array.length) {
//            extend();
//        }
//        array[size++] = value;
//
//    }
//
//    public void add(int[] numbers){
//
//        for (int number : numbers) {
//            add(number);
//        }
//
//    }
//    public boolean isExist(int value) {
////        int count = 0;
////        boolean isExist = true;
////        for (int i = 0; i < array.length ; i++) {
////            if (array[i] == value){
////            count++;
////        }else{
////                isExist = false;
////        }
//        for (int i = 0; i < size; i++) {
//            if(array[i] == value) {
//                return true;
//            }
//
//        }
//        return false;
//    }
//        public boolean isEmpty() {
//        return size == 0;
//
//
//        }
//
//    public void add(int value, int index) {
//        if((index < 0) || (index > size)){
//            System.err.println("invalid index");
//        }else {
//
//            if (size == array.length) {
//                extend();
//            }
//            for (int i = size - 1; i >= index; i--) {
//                array[i + 1] = array[i];
//
//            }
//            array[index] = value;
//            size++;
//        }
//
//    }
//
//    public void set(int value, int index){
//        if((index < 0) && (index > size)){
//
//        }else{
//            array[size++] = value;
//        }
//    }
//
//    // stexcel hin masivic tas element aveli mec masiv
//    // qcel hin masivi elementnery nori mej
//    // hin masivi hxumy kapenq nor masivi hxman het
//
//    private void extend() {
//        int temp[] = new int[array.length + 10];
//        for (int i = 0; i < array.length; i++) {
//            temp[i] = array[i];
//        }
//        array = temp;
//
//    }
//    // ete trvac indeqsy mer unecac  masivi indeqsi sahmannerum e, veradarcnel masivi index-erord elementy,
//    // hakarak depqum -1
//
//    public int getByIndex(int index) {
//
//            if((index < 0) && (index > size)){
//                return  array[index];
//            }
//       return -1;
//    }
//
//    public void delete(int index){
//        if((index < 0) || (index > size)){
//            System.out.println("invalid");
//        }
//        for (int i = index + 1; i < size; i++) {
//           array[i -1] = array[i];
//        }
//        size--;
//
//    }
////
////    // tpel masivi avelacvac elementnery
//    public void print() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(array[i]);
//        }
//
//    }
//
//
//}
