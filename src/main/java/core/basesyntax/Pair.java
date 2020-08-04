package core.basesyntax;

class Pair<T, K> {

    T first;
    K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    private Pair() {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return (first == pair.first)
                || (first != null && first.equals(pair.first))
                && (second == pair.second)
                || (second != null && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 31;
        if (first != null) {
            result = result * result + first.hashCode();
        }
        if (second != null) {
            result = result * result + second.hashCode();
        }
        return result;
    }
}
