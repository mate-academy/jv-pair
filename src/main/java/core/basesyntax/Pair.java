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

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Pair<T, V> pair = (Pair<T, V>) object;
        return ((first == pair.first || (first != null && first.equals(pair.first)))
                && (second == pair.second || (second != null && second.equals(pair.second))));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + (first == null ? 0 : first.hashCode());
        result = prime * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
