package HomeWork7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, *, /):");
        String operator = scanner.next();

        OperationAdapter adapter = new OperationAdapter();
        Operation operation = adapter.getOperation(operator);

        double result = operation.execute(num1, num2);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}
