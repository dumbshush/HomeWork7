package HomeWork7;

public class LoggingOperation implements Operation{
    private Operation operation;

    public LoggingOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public double execute(double num1, double num2) {
        double result = operation.execute(num1, num2);
        System.out.println("Операция: " + operation.getClass().getSimpleName() + ", Результат: " + result);
        return result;
    }
}
