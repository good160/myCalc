import java.io.IOException;
import java.util.Scanner;

public class calculator {
    public static int a;
    public static int b;
    public static char c;
    public static String result ;
    public static void main(String[] args) throws IOException {
        //--------------Вызов функции

        System.out.println("Введите первое число: ");
        calculator.a  = new Scanner(System.in).nextInt();
        if (calculator.a > 10 || calculator.a < 0 ) {
            throw new IOException();
        }
        System.out.println("Введите второе число: ");
        calculator.b = new Scanner(System.in).nextInt();
           if (calculator.b > 10 || calculator.b < 0) {
            throw new IOException();
           }
        System.out.println("Введите действие (+,-,*,/)");
        calculator.c = new Scanner(System.in).nextLine().charAt(0);
        calculator.result  = calc();
        if (calculator.c == '+') {
            System.out.println("Input: " + a + " + " + b + '\n' + "Output: " + calculator.result);

        } else if (calculator.c =='-') {
            System.out.println("Input: " + a + " - " + b + '\n' + "Output: " + calculator.result);
        } else if (calculator.c == '*') {
            System.out.println("Input: " + a + " * " + b + '\n' + "Output: " + calculator.result);
        } else if (calculator.c == '/'){
            System.out.println("Input: " + a + " / " + b + '\n' + "Output: " + calculator.result);

        }else {
            throw new IOException();
        }

    }

    public static String calc() {
        switch (c) {
            case '+':
               calculator.result = Integer.toString(a + b);

            return calculator.result;

            case '-':
                 calculator.result  = Integer.toString(a - b);
            return calculator.result;

            case '*':
                calculator.result = Integer.toString(a * b);
            return calculator.result;

            case '/':
                calculator.result = Integer.toString(a /b);
            return calculator.result;
            default:
                System.out.println("Вы ВВЕЛИ НЕКОРРЕКтеуЮ комманду,Программа завершена!");


        }
        return calculator.result;
    }
}






