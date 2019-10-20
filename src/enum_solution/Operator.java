package enum_solution;

public enum Operator {
    ADD {
        @Override
        public double apply(double numberA, double numberB) {
            return numberA + numberB;
        }
    }, MULTIPLY {
        @Override
        public double apply(double numberA, double numberB) {
            return numberA * numberB;
        }
    }, DIVIDE {
        @Override
        public double apply(double numberA, double numberB) {
            return numberA / numberB;
        }
    }, SUBTRACT {
        @Override
        public double apply(double numberA, double numberB) {
            return numberA - numberB;
        }
    };

    public abstract double apply(double numberA, double numberB);
}
