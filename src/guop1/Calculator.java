package guop1;

public class Calculator {
    int a;  // karli e naev popoxakannery global chhaytararel
    int b;

   public int sum(int a,int b){
        int sum = 0;
        sum = a + b;
        return sum;  // return a+b;
    }
    public int sub(int a, int b) {
        int sub = 0;
        if(a > b) {
            sub = a - b;
            return sub;
        }else{
            sub = b-a;
            return sub;
        }
    }
   public int multi(int a, int b){
        int multi = 0;
        multi = a * b;
        return multi;  // return  a*b;
    }
   public double division(double a, double b) {
        double div = a / b;
        if (b != 0 ) {
            return div;
        }
        return 0;
    }
}
