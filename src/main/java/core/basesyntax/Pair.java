package core.basesyntax;

class Pair<T, V> {

    private final T first;
    private final V second;

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

    public static <T, V> Pair<T, V> of(T t, V v) {
        return new Pair<>(t, v);
    }

    @Override
    public int hashCode() {
        return 71 * 31 + (first == null ? 0 : first.hashCode())
                * 71 * 31 + (second == null ? 0 : second.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Pair<T, V> object = (Pair<T, V>) obj;
        if (obj == null || !this.getClass().equals(object.getClass())) {
            return false;
        }
        boolean firstEquals = (this.first == null && object.first == null)
                || this.first != null && this.first.equals(object.first);
        boolean secondEquals = (this.second == null && object.second == null)
                || this.second != null && this.second.equals(object.second);
        return firstEquals && secondEquals;
    }
}
