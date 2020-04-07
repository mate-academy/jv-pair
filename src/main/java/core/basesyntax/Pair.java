package core.basesyntax;

class Pair<K, V> {
    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair of(K first, V second) {
        return new Pair<K, V>(first, second);
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Pair<K, V> otherPair = (Pair) object;
        return first == otherPair.first || first != null && first.equals(otherPair.first)
                && second == otherPair.second || second != null && second.equals(otherPair.second);
    }

    public int hashCode() {
        int result = 13;
        result = result * 31 + (first == null ? 0 : first.hashCode());
        result = result * 31 + (second == null ? 0 : second.hashCode());
        return result;
    }

}
