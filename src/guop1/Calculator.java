package guop1;

public class Calculator {
    int a;
    int b;

    int sum(int a,int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }
    int sub(int a, int b) {
        int sub = 0;
        if(a > b) {
            sub = a - b;
            return sub;
        }else{
            sub = b-a;
            return sub;
        }
    }
    int multi(int a, int b){
        int multi = 0;
        multi = a * b;
        return multi;
    }
    int division(int a, int b) {
        int div = a / b;
        int div1 = b / a;
        if (b > 0 || a > 0) {
            return div;
        }
        return 0;
    }
}
