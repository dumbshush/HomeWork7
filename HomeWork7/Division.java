package HomeWork7;

public class Division implements Operation{
    @Override
    public double execute(double num1, double num2) {
        // TODO Auto-generated method stub
        if (num2 == 0) {
            System.out.println("Делить на ноль нельзя!");
        }
        return num1 / num2;
    }
}
