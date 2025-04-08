package Vista;

import java.util.function.IntConsumer;
import java.util.Map;

public class CyclomaticTest {

    private static final Map<Integer, IntConsumer> actions = Map.of(
        1, a -> System.out.println("one"),
        2, a -> System.out.println("two"),
        3, a -> System.out.println("many")
    );

    public static void cyclomaticTest(int a) {
        actions.getOrDefault(a, x -> System.out.println("lots")).accept(a);
    }

    public static void main(String[] args) {
        cyclomaticTest(1); // Puedes cambiar el valor aquí para probar distintos casos
    }
}