package core.basesyntax;

class Pair<T, V> {
    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair<T, V> of(T first, V second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return this.first;
    }

    public V getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass().equals(this.getClass())) {
            Pair<T, V> current = (Pair<T, V>) obj;
            return (this.first == null && current.first == null
                    || this.first != null && this.first.equals(current.first))
                    && (this.second == null && current.second == null
                    || this.second != null && this.second.equals(current.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 11 * result + (this.first == null ? 0 : this.first.hashCode());
        result = 13 * result + (this.second == null ? 0 : this.second.hashCode());
        return result;
    }
}
