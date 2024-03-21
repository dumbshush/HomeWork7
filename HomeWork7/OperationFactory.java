package HomeWork7;

class OperationFactory {
    Operation createOperation(String operator){
        switch (operator) {
            case "+":
                return new Addition();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "-":
                return new Subtraction();
            default:
            System.out.println("Такой операции нет");
                return null;
        }
    }
}
