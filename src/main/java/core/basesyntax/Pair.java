package core.basesyntax;

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair<>(first, second);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = getFirst() != null ? 31 * hash + first.hashCode() : hash;
        hash = getSecond() != null ? 31 * hash + second.hashCode() : hash;

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass().equals(Pair.class)) {
            Pair<T, K> pair = (Pair) obj;
            return first == pair.first || (first != null && first.equals(pair.first))
                    && second == pair.second || (second != null && second.equals(pair.second));
        }
        return false;
    }
}
