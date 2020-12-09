package core.basesyntax;

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public static <T, K> Pair<T, K> of(T first, K second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (getClass().equals(pair.getClass())) {
            Pair<T, K> current = (Pair<T, K>) pair;
            return ((first == current.first || first != null && first.equals(current.first))
                    && (second == current.second || second != null
                    && second.equals(current.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 19 * result + (first == null ? 0 : first.hashCode());
        result = 19 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
