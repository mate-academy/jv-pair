package core.basesyntax;

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public static <T, K> Pair<T, K> of(T first, K second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + ((first == null) ? 0 : first.hashCode());
        result = 31 * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || !object.getClass().equals(Pair.class)) {
            return false;
        }
        Pair<T, K> pair = (Pair<T, K>) object;
        return (first == null ? first == pair.first : first.equals((pair.first)))
                && (second == null ? second == pair.second : second.equals(pair.second));
    }
}
