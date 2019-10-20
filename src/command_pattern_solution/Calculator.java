package command_pattern_solution;

class Calculator {
    double calculate(Command command) {
        return command.execute();
    }
}
