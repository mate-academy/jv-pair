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

    public void setFirst(T firstP) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
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
        if (object.getClass().equals(Pair.class)) {
            Pair<T, V> pair = (Pair<T, V>) object;
            return (pair.first == first || first != null && first.equals(pair.first))
                    && (pair.second == second || second != null && second.equals(pair.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
