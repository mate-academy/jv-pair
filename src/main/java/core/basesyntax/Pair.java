package core.basesyntax;

class Pair<T, S> {
    private T first;
    private S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static <T, S> Pair of(T t, S s) {
        return new Pair<T, S>(t, s);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pair<T, S> pair = (Pair) obj;
        return ((first == pair.first) || (first != null && first.equals(pair.first)))
                && ((second == pair.second) || (second != null && second.equals(pair.second)));
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
