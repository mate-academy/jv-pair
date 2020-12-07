package core.basesyntax;

class Pair<T, V> {

    private final T fist;
    private final V second;

    private Pair(T fist, V second) {
        this.fist = fist;
        this.second = second;
    }

    public T getFirst() {
        return fist;
    }

    public V getSecond() {
        return second;
    }

    public static <T, V> Pair<T, V> of(T t, V v) {
        return new Pair<>(t, v);
    }

    @Override
    public int hashCode() {
        return 71 * 31 + (fist == null ? 0 : fist.hashCode())
                * 71 * 31 + (second == null ? 0 : second.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Pair<T, V> object = (Pair<T, V>) obj;
        if (this.fist == null ^ object.fist == null
                || this.second == null ^ object.second == null) {
            return false;
        }
        if (this.getClass().equals(object.getClass())) {
            return (this.fist == null && this.second == null)
                    || (this.fist != null && this.second != null)
                    && ((this.fist.equals(object.fist)
                    && this.second.equals(object.second))
                    && this.fist.hashCode() == object.fist.hashCode()
                    && this.second.hashCode() == object.second.hashCode());
        }
        return false;
    }
}
