package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("첫 번째 숫자: ");
        int a = sc.nextInt();

        System.out.print("연산기호 (+, -, /, *): ");
        String op = sc.next();

        System.out.print("두 번째 숫자: ");
        int b = sc.nextInt();

        try {
            int result = calc.calculate(a, op, b);
            System.out.println("결과: " + result);
        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }

        sc.close();
    }
}