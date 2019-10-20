package initial;

class Calculator {
    double calculate(double numberA, double numberB, String operator) {
        double result = Integer.MIN_VALUE;

        if ("add".equals(operator)) {
            result = numberA + numberB;
        } else if ("multiply".equals(operator)) {
            result = numberA * numberB;
        } else if ("divide".equals(operator)) {
            result = numberA / numberB;
        } else if ("subtract".equals(operator)) {
            result = numberA - numberB;
        }

        return result;
    }
}
