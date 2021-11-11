package guop1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input a");
            int a = scanner.nextInt();

            System.out.println("please input b");
            int b = scanner.nextInt();

            boolean isWrongOperation = false;

            do {
                isWrongOperation = false;
                //  System.out.println(c);
                System.out.println("Please input operation(+, -, * , /) or 0 for exit");
                String c = scanner.next();

                switch (c) {
                    case "+":
                        System.out.println("Result: " + (calc.sum(a, b)));
                        break;
                    case "-":
                        System.out.println("Result: " + (calc.sub(a, b)));


                        break;
                    case "*":
                        System.out.println("Result: " + (calc.multi(a, b)));

                        break;
                    case "/":
                        System.out.println("Result: " + (calc.division(a, b)));
                    case "0":
                        isRun = false;

                        break;
                    default:
                        isWrongOperation = true;
                        System.out.println("==== INVALID OPERATION ====");

                }
            } while (isWrongOperation);


        }
    }
}