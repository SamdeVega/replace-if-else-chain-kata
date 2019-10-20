package factory_pattern_solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class OperatorFactory {
    private static Map<String, Operation> operationMap = new HashMap<>();
    static {
        operationMap.put("add", new Addition());
        operationMap.put("multiply", new Multiplication());
        operationMap.put("divide", new Division());
        operationMap.put("subtract", new Subtraction());
    }

    static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
