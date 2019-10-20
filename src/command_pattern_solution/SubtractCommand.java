package command_pattern_solution;

class SubtractCommand implements Command {
    private final double numberA;
    private final double numberB;

    SubtractCommand(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public double execute() {
        return numberA - numberB;
    }
}
