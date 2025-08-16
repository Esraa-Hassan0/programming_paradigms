package concepts;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class passingFunctionAsAnArgument {
    public static int apply_function(int value, Function<Integer, Integer> func) {
        return func.apply(value);
    }

    public static Boolean check(int value, Predicate<Integer> pred) {
        return pred.test(value);
    }

    public static void printMessage(String message, Consumer<String> consumer) {
        consumer.accept(message);
    }

    public static int operation(int a, int b, BiFunction<Integer, Integer, Integer> bi) {
        return bi.apply(a, b);
    }

    public static void main(String[] args) {
        System.out.println(apply_function(5, x -> x + 10));
        System.out.println(check(5, x -> x == 10));
        printMessage("esaaa", s -> System.out.println("<<<" + s + ">>>"));
        System.out.println(operation(1, 19, (x, y) -> (x * 2 + y)));
    }
}
