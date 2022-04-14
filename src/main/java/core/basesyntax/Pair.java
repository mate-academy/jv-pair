package core.basesyntax;

class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T,V> Pair<T,V> of(T first, V second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            Pair<T,V> pair = (Pair<T,V>) object;
            return (first == pair.first || first != null && first.equals(pair.first))
                   && (second == pair.second || second != null && second.equals(pair.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 17 * result + (first == null ? 0 : first.hashCode());
        result = 17 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
