package rule_engine_solution;

public interface Rule {
    boolean evaluate(Expression expression);
    double getResult();
}
