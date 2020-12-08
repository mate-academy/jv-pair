package core.basesyntax;

class Pair <K, V> {
    private K first;
    private V second;

    public void setFirst(K first) {
        this.first = first;
    }

    public K getFirst() {
        return first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public V getSecond() {
        return second;
    }

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (pair.getClass().equals(Pair.class)) {
            Pair<K, V> current = (Pair<K, V>) pair;
            return (first == current.first || first != null
                    && first.equals(current.first))
                    && (second == current.second || second != null
                    && second.equals(current.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    public static <K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }
}
