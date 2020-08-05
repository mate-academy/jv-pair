package core.basesyntax;

class Pair<T, V> {
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

    public static <T, V> Pair<T, V> of(T first, V second) {
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
        if (getClass() == Pair.class) {
            Pair<T, V> pair = (Pair<T, V>) object;
            return (((first == null) && (pair.first == null))
                    || (first != null && first.equals(pair.first)))
                    && (((second == null) && (pair.second == null))
                    || (second != null && second.equals(pair.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;
        if (first != null) {
            result = 31 * result * getFirst().hashCode();
        }
        if (second != null) {
            result = 31 * result * getSecond().hashCode();
        }
        return result;
    }
}
