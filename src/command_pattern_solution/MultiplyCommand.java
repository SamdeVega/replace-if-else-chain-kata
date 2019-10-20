package command_pattern_solution;

class MultiplyCommand implements Command {
    private final double numberA;
    private final double numberB;

    MultiplyCommand(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public double execute() {
        return numberA * numberB;
    }
}
