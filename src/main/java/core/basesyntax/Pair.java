package core.basesyntax;

import java.util.Objects;

/**
 * Реализуйте generic-класс Pair, содержащий пару элементов разных типов
 * и не запрещающий элементам принимать значение null.
 * <p>
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
 * а также статический фабричный метод of().
 * Конструктор должен быть закрытым (private).
 */

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(getFirst(), pair.getFirst())
                && Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + 31 * second.hashCode();
    }
}
