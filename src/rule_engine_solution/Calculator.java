package rule_engine_solution;

public class Calculator {
    double calculate(double numberA, double numberB, Operator operator) {
        return new RuleEngine().process(new Expression(numberA, numberB, operator));
    }
}
