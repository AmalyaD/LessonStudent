package guop1.Homework;

public class PracticeHomework {
        //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
        long convert(int minutes) {

          // long second = (long)60 * (long)minutes;
            return (long)60 * (long)minutes;
        }
        //ընդունել տարին, վերադարձնել օրերի քանակը։
        int calcAge(int years) {
          //  int daysOfYear = 365 * years;
            return 365 * years;
        }
        //վերադարձնել տրված թվի հաջորդ թիվը
        int nextNumber(int number) {
        //    int nextNum = 1 + number;

            return 1 + number;
        }
        //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
        boolean isSameNum(int a, int b) {
            //boolean isSame = true;
            if (a != b) {
                return  false;
            }
            return true;
        }
        //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
        //մնացած դեպքերում վերադարձնել false
        boolean lessThanOrEqualToZero(int number) {
            boolean isZeroOrNo = true;
            if (number > 0) {
                isZeroOrNo = false;
            }
            return isZeroOrNo;
        }
        //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
        boolean reverseBool(boolean value) {
            return !value;
        }
        //վերադարձնել երկու մասիվի ամենամեծ length-ը
        int maxLength(int[] array1, int[] array2) {
           int max = 0;

            if ( array1.length > array2.length  ) {
                max = array1.length;
            }else {
                max = array2.length;
            }
            return max;
        }
}
