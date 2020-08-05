package core.basesyntax;

class Pair<T, V> {
    private T firse;
    private V second;

    private Pair(T firse, V second) {
        this.firse = firse;
        this.second = second;
    }

    public T getFirst() {
        return firse;
    }

    public V getSecond() {
        return second;
    }

    public static <T, V> Pair<T, V> of(T firse, V second) {
        return new Pair<>(firse, second);
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
        return ((firse == pair.firse || firse != null && firse.equals(pair.firse))
                && (second == pair.second || second != null && second.equals(pair.second)));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + (firse == null ? 0 : firse.hashCode());
        result = prime * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
