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

    public static Pair of(Object first, Object second) {
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
        Pair<T, K> pair = (Pair<T, K>) o;
        if (first == null && pair.first == null
                && second == null && pair.second == null) {
            return true;
        }
        if (first != null && second != null) {
            return first.equals(pair.first) && second.equals(pair.second);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (first != null) {
            result = result * 31 + first.hashCode();
        }
        if (second != null) {
            result = result * 31 + second.hashCode();
        }
        return result;
    }
}
