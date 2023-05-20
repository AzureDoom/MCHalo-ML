package mod.azure.mchalo.util;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Boston Vanseghi
 */
public class Func {

    private Func() {}

    public static <T, R> R let(T obj, Function<T, R> function) {
        if (obj == null) return null;
        return function.apply(obj);
    }

    public static <T> void let(T obj, Consumer<T> consumer) {
        if (obj == null) return;
        consumer.accept(obj);
    }

    public static <T> T also(T obj, Consumer<T> consumer) {
        consumer.accept(obj);
        return obj;
    }
}