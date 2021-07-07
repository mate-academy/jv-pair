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

    public static <K, V> Pair of(K first, V second) {
        return new Pair<K, V>(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        if (object.getClass().equals(Pair.class)) {
            Pair<K, V> pair = (Pair) object;
            return ((first == pair.first)
                    || first != null && first.equals(pair.first))
                    && ((second == pair.second)
                    || (second != null && second.equals(pair.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = first == null ? result : 13 * first.hashCode();
        result = second == null ? result : 13 * second.hashCode();
        return result;
    }
}
