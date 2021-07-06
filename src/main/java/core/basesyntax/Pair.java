package core.basesyntax;

class Pair<K, T> {
    private final K first;
    private final T second;

    private Pair(K first, T second) {
        this.first = first;
        this.second = second;
    }

    public static <K, T> Pair of(K firstValue, T secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    public K getFirst() {
        return first;
    }

    public T getSecond() {
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
        Pair<K, T> pair = (Pair) o;
        return ((first == pair.first)
                || (first != null && first.equals(pair.first)))
                && ((second == pair.second)
                || (second != null && second.equals(pair.second)));
    }

    @Override
    public int hashCode() {
        int value = 17;
        if (first != null) {
            value = 31 * value + first.hashCode();
        }
        if (second != null) {
            value = 31 * value + second.hashCode();
        }
        return value;
    }
}
