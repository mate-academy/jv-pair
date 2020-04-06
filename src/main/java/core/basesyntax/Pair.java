package core.basesyntax;

public final class Pair<U, V> {
    private final U first;
    private final V second;

    private Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <U, V> Pair of(U first, V second) {
        return new Pair<>(first, second);
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return first == null ? pair.first == null : first.equals(pair.first)
                && second == null ? pair.second == null : second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return 31 + 17 * (first != null ? first.hashCode() : 0)
                + 17 * (second != null ? second.hashCode() : 0);
    }
}
