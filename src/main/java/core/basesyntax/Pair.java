package core.basesyntax;

class Pair<K, V> {
    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair<K, V> of(K first, V second) {
        return new Pair<>(first, second);
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = getFirst() != null ? 43 * hash + first.hashCode() : hash;
        hash = getSecond() != null ? 43 * hash + second.hashCode() : hash;

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass().equals(Pair.class)) {
            Pair pair = (Pair) obj;
            return first == pair.first || (first != null && first.equals(pair.first))
                    && second == pair.second || (second != null && second.equals(pair.second));
        }
        return false;
    }
}
