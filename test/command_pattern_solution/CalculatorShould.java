package command_pattern_solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorShould {
    private Calculator calculator;

    @BeforeEach
    void init() {
        this.calculator = new Calculator();
    }

    @Test
    void add_two_numbers() {
        assertEquals(14, calculator.calculate(new AddCommand(9, 5)));
    }

    @Test
    void multiply_two_numbers() {
        assertEquals(45, calculator.calculate(new MultiplyCommand(9, 5)));
    }

    @Test
    void divide_two_numbers() {
        assertEquals(1.8, calculator.calculate(new DivideCommand(9, 5)));
    }

    @Test
    void subtract_two_numbers() {
        assertEquals(4, calculator.calculate(new SubtractCommand(9, 5)));
    }
}
