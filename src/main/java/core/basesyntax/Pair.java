package core.basesyntax;

class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return pair.first != null ? pair.first.equals(first) : first == null
                && pair.second != null ? pair.second.equals(second) : second == null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (first != null ? first.hashCode() : 1);
        result = result * 31 + (second != null ? second.hashCode() : 1);
        return result;
    }
}








