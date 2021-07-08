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
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Pair<K, V> pair = (Pair<K, V>) other;
        return (first == pair.first || (first != null && first.equals(pair.getFirst())))
                && (second == pair.second || (second != null && second.equals(pair.getSecond())));
    }

    @Override
    public int hashCode() {
        final int prime = 41;
        int result = 11;
        result = prime * result + ((first != null) ? first.hashCode() : 0);
        result = prime * result + ((second != null) ? second.hashCode() : 0);
        return result;
    }
}
