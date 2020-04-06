package core.basesyntax;

class Pair<T,V> {

    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
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
        Pair<T, V> pair = (Pair) o;
        if (first != null && !first.equals(pair.first)) {
            return false;
        }
        if (second != null && !second.equals(pair.second)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (first == null ? 0 : first.hashCode());
        result = result * 31 + (second == null ? 0 : second.hashCode());
        return result;
    }

    public static <T, V> Pair<T, V> of(T first, V second) {
        return new Pair<T, V>(first, second);
    }
}
