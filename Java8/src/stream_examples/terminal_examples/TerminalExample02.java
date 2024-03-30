package stream_examples.terminal_examples;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class TerminalExample02 {
    public static void main(String[] args) {
        // DoubleStream filter(DoublePredicate predicate);
        Optional<Double> temperature = List.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2).stream()
                .filter(temp -> temp > 0)
                .findFirst();

// DoubleStream filter(DoublePredicate predicate);
        Optional<Double> temperature2 = List.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2).stream()
                .filter(temp -> temp > 0)
                .findAny();

        System.out.println(temperature);
        System.out.println(temperature2);
    }
}
