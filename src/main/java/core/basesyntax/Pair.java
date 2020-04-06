package core.basesyntax;

class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return first;
    }

    V getSecond() {
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
            Pair pair = (Pair) object;
            return first == null ? pair.first == null : first.equals(pair.first)
                    && second == null ? pair.second == null : second.equals(pair.second);
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
