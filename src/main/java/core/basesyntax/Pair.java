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
        return new Pair<T, S>(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        Pair<T, S> pair = (Pair) obj;
        return (pair.getFirst() == this.first
                || (pair.getFirst() != null && pair.getFirst().equals(this.first)))
                && (pair.getSecond() == this.second)
                || (pair.getSecond() != null && pair.getSecond().equals(this.second));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (first != null ? first.hashCode() : 1);
        result = result * 31 + (second != null ? second.hashCode() : 1);
        return result;
    }
}








