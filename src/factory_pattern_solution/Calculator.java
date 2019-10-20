package factory_pattern_solution;

class Calculator {
    double calculate(double numberA, double numberB, String operator) {
        return OperatorFactory.getOperation(operator).orElseThrow(() -> new IllegalArgumentException("Invalid operator")).apply(numberA, numberB);
    }
}
