package core.basesyntax;

class Pair<K, V> {
    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair of(K first, V second) {
        return new Pair(first, second);
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pair<K, V> pair = (Pair) obj;
        return ((first == pair.first) || (first != null && first.equals(pair.first)))
                && ((second == pair.second) || (second != null && second.equals(pair.second)));
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = 31 * hash + (this.first != null ? first.hashCode() : 0);
        hash = 31 * hash + (this.second != null ? second.hashCode() : 0);
        return hash;
    }
}
