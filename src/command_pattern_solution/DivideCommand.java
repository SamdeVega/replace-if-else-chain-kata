package command_pattern_solution;

class DivideCommand implements Command {
    private final double numberA;
    private final double numberB;

    DivideCommand(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public double execute() {
        return numberA / numberB;
    }
}
