package guop1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input a");
        int a = scanner.nextInt();

        String c = scanner.next();
//        System.out.println(c);


//        System.out.println("please input b");
        int b = scanner.nextInt();
        switch (c) {
            case "+":
                System.out.println("Result: " + (calc.sum(a,b)));
                break;
            case "-":
                System.out.println("Result: " + (calc.sub(a,b)));
                break;
            case "*":
                System.out.println("Result: " + (calc.multi(a,b)));
                break;
            case "/":
                System.out.println("Result: " + (calc.division(a,b)));
                break;
            default:
                System.out.println("==== INVALID ====");
                break;
        }


    }
}
