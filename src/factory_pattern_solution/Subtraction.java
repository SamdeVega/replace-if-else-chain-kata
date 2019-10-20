package factory_pattern_solution;

public class Subtraction implements Operation {
    @Override
    public double apply(double numberA, double numberB) {
        return numberA - numberB;
    }
}
