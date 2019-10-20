package command_pattern_solution;

class AddCommand implements Command {
    private final double numberA;
    private final double numberB;

    AddCommand(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public double execute() {
        return numberA + numberB;
    }
}
