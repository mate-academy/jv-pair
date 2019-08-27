package core.basesyntax;

class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T t, V v) {
        this.first = t;
        this.second = v;
    }

    public T getFirst() {
        return this.first;
    }

    public V getSecond() {
        return this.second;
    }

    public static <T, V> Pair<T, V> of(T first, V second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<T, V> pair = (Pair) o;
        return pair.getFirst().equals(this.first)
                && pair.getSecond().equals(this.second);
    }

    @Override
    public int hashCode() {
        return this.getFirst().hashCode() * 23 + this.getSecond().hashCode() / 31;
    }


}
