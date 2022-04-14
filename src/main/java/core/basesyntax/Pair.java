package core.basesyntax;

class Pair<T, V> {
    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair<T, V> of(T first, V second) {
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
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass().equals(this.getClass())) {
            Pair<T, V> current = (Pair<T, V>) obj;
            return (first == null && current.first == null
                    || first != null && first.equals(current.first))
                    && (second == null && current.second == null
                    || second != null && second.equals(current.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 11 * result + (first == null ? 0 : first.hashCode());
        result = 13 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
