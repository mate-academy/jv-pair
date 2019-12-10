package core.basesyntax;

class Pair<K, V> {
    private K first;
    private V second;

    public static <K, V> Pair of(K first, V second) {
        return new Pair<>(first, second);
    }

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return this.second == pair.second & this.first == pair.first;
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + second.hashCode();
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
