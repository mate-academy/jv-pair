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

    public static <T, S> Pair of(T first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (!first.equals(pair.first)) {
            return false;
        }
        return second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        return result;
    }
}
