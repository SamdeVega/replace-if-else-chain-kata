package enum_solution;

class Calculator {
    double calculate(double numberA, double numberB, Operator operator) {
        return operator.apply(numberA, numberB);
    }
}
