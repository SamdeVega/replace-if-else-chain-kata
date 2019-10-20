package rule_engine_solution;

public class MultiplyRule implements Rule {
    private double result;

    @Override
    public boolean evaluate(Expression expression) {
        boolean evaluation = false;

        if (expression.getOperator() == Operator.MULTIPLY) {
            this.result = expression.getNumberA() * expression.getNumberB();
            evaluation = true;
        }

        return evaluation;
    }

    @Override
    public double getResult() {
        return this.result;
    }
}
