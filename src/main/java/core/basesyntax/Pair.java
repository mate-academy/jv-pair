package core.basesyntax;

class Pair<T,R> {
    private T first;
    private R second;

    private Pair(T first, R second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }

    public static <T, R> Pair of(T first, R second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, R> pair = (Pair<T, R>) o;
        return (first == pair.first || (first != null && first.equals(pair.first)))
                && (second == pair.second || (second != null && second.equals(pair.second)));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
