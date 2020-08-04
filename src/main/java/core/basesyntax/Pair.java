package core.basesyntax;

class Pair<T, V> {
    T first;
    V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair of(T first, V second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
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
        if (obj == null) {
            return false;
        }
        if (getClass().equals(obj.getClass())) {
            Pair pair = (Pair) obj;
            return (pair.first != null && first != null
                    ? first.equals(pair.first)
                    : pair.first == null && first == null)
                    && (pair.second != null && second != null
                    ? second.equals(pair.second)
                    : pair.second == null && second == null);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (first == null ? 0 : first.hashCode());
        result = result * 31 + (second == null ? 0 : second.hashCode());
        return result;
    }
}
