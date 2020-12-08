package core.basesyntax;

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
        return (first == current.first || first != null
                && first.equals(current.first))
                && (second == current.second || second != null
                && second.equals(current.second));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
