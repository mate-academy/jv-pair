package core.basesyntax;

import java.util.Objects;

class Pair<K, V> {
    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static <K, V> Pair<K, V> of(K first, V second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null || getClass() != pair.getClass()) {
            return false;
        }
        Pair<?, ?> current = (Pair<?, ?>) pair;
        return Objects.equals(first, current.first)
                && Objects.equals(second, current.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
