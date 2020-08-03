package core.basesyntax;

class Pair<T, U> {
    private final T first;
    private final U second;

    private Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
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
        if (first == null && pair.first != null
                || first != null && !first.equals(pair.first)) {
            return false;
        }
        return second == null && pair.second == null
               || second != null && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int hash = first == null ? 0 : first.hashCode();
        hash = second == null ? hash : hash * 31 + second.hashCode();
        return hash;
    }
}
