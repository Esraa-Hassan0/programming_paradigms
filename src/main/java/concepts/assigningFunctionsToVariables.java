package concepts;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class assigningFunctionsToVariables {
    public static void main(String[] args) {
        Function<Integer, Integer> f = (x) -> x * x;
        System.out.println(f.apply(4));

        Predicate<Integer> p = (x) -> x % 2 == 0;
        System.out.println(p.test(4));

        Consumer<String> c = (x) -> System.out.println(x + x);
        c.accept("woop");

        BiFunction<Integer, String, String> b = (x, y) -> x + y;
        System.out.println(b.apply(1, "lol"));
    }
}
