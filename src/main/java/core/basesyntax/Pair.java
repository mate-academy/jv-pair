package core.basesyntax;

class Pair<T, E> {

    private T first;
    private E second;

    private Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public static <T, E> Pair<T, E> of(T first, E second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == null) {
            return false;
        }
        if (this == pair) {
            return true;
        }
        if (pair.getClass().equals(Pair.class)) {
            Pair<T, E> current = (Pair<T, E>) pair;
            return (first == current.first || first != null
                    && first.equals(current.first))
                    && (second == current.second || second != null
                    && second.equals(current.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 37 * (first == null ? 0 : first.hashCode());
        result = 41 * (second == null ? 0 : second.hashCode());
        return result;
    }
}
