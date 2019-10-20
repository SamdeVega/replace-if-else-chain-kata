package rule_engine_solution;

class Expression {
    private double numberA;
    private double numberB;
    private Operator operator;

    Expression(double numberA, double numberB, Operator operator) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.operator = operator;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public Operator getOperator() {
        return this.operator;
    }
}
