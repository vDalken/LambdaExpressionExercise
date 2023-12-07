class Calculator {
    public static int executeOperation(int x, int y, Operation operation){
        return operation.calculate(x,y);
    }
}
