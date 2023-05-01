package core.basesyntax;

class Pair<T, V> {
    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static <T, V> Pair<T, V> of(T first, V second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object pair) {

        if (pair == this) {
            return true;
        }

        if (pair == null) {
            return false;
        }

        if (pair.getClass().equals(getClass())) {
            Pair<T, V> current = (Pair<T, V>) pair;
            return ((current.first == null) ? current.first == first
                    : current.first.equals(first))
                    && ((current.second == null) ? current.second == second
                    : current.second.equals(second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
