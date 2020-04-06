package core.basesyntax;

class Pair<T, S> {
    private T fist;
    private S second;

    public Pair(T fist, S second) {
        this.fist = fist;
        this.second = second;
    }

    public T getFirst() {
        return fist;
    }

    public S getSecond() {
        return second;
    }

    public static <T, K> Pair<T, K> of(T t, K k) {
        return new Pair<>(t, k);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return pair.fist != null ? pair.fist.equals(fist) : fist == null
                && pair.second != null ? pair.second.equals(second) : second == null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (fist != null ? fist.hashCode() : 1);
        result = result * 31 + (second != null ? second.hashCode() : 1);
        return result;
    }
}
