package rule_engine_solution;

import java.util.List;
import java.util.ArrayList;

class RuleEngine {
    private static List<Rule> rules = new ArrayList<>();

    static {
        rules.add(new AddRule());
        rules.add(new MultiplyRule());
        rules.add(new DivideRule());
        rules.add(new SubtractRule());
    }

    double process(Expression expression) {
        Rule matchingRule = rules.stream()
                        .filter(rule -> rule.evaluate(expression))
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("Invalid expression"));
        return matchingRule.getResult();
    }
}
