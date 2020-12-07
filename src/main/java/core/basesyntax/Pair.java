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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass().equals(this.getClass())) {
            Pair<K, V> pair = (Pair<K, V>) o;
            return (first == null && pair.first == null || first != null
                    && first.equals(pair.first)) && (second == null
                    && pair.second == null || second != null && second.equals(pair.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + (first == null ? 0 : first.hashCode());
        result += 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
