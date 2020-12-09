package core.basesyntax;

class Pair<T, W> {
    private T first;
    private W second;

    private Pair(T first, W second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public W getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 21 * result + (first == null ? 0 : first.hashCode());
        result = 21 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == this) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (pair.getClass().equals(Pair.class)) {
            Pair current = (Pair) pair;
            return ((first == current.first || first != null
                    && first.equals(current.first))
                    && (second == current.second || second != null
                    && second.equals(current.second)));
        }
        return false;
    }

    public static <T, W> Pair<T, W> of(T first, W second) {
        return new Pair<T, W>(first, second);
    }
}

