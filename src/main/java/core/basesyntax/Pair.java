package core.basesyntax;

import java.util.Objects;

class Pair<T, K> {

    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public static <T, K> Pair<T, K> of(T first, K second) {
        return new Pair<T, K>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Pair<T, K> pair = (Pair<T, K>) object;
        return Objects.equals(first, pair.first)
                && Objects.equals(second, pair.second);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = first == null ? 31 * result * 1 : 31 * result * first.hashCode();
        result = second == null ? 31 * result * 1 : 31 * result * second.hashCode();
        return result;
    }
}
