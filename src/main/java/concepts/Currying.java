package concepts;

import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Currying {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> add = x -> (y -> x + y);

        int result = add.apply(1).apply(2);
        System.out.println(result);

        Function<Integer, Integer> add5 = add.apply(5);
        System.out.println(add5.apply(4));
    }
}