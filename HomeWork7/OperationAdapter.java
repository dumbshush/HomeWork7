package HomeWork7;

public class OperationAdapter {
    private OperationFactory factory;

    OperationAdapter(){
        this.factory = new OperationFactory();
    }

    Operation getOperation(String operator) {
        return new LoggingOperation(factory.createOperation(operator));
    }
}
