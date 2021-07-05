package core.basesyntax;

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public static <T, K> Pair<T, K> of(T first, K second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return first == null ? first == pair.first : first.equals(pair.first)
                && second == null ? second == pair.second : second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int primaryNumber = 17;
        return ((primaryNumber * 7 + (first == null ? 0 : first.hashCode()))
                * 7 + (second == null ? 0 : second.hashCode()));
    }
}
