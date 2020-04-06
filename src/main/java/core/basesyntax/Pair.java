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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, K> obj = (Pair<T, K>) o;
        return first == null && obj.first == null || first != null && first.equals(obj.first)
                && second == null && obj.second == null || second != null
                && second.equals(obj.second);
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (first != null) {
            result += 31 * first.hashCode();
        }
        if (second != null) {
            result += 31 * second.hashCode();
        }
        return result;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair<>(first, second);
    }
}
