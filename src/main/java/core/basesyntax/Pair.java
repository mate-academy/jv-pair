package core.basesyntax;

class Pair<T, V> {
    private T val1;
    private V val2;

    private Pair(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getFirst() {
        return val1;
    }

    public V getSecond() {
        return val2;
    }

    public static <T, V> Pair<T, V> of(T val1, V val2) {
        return new Pair<>(val1, val2);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Pair pair = (Pair) object;
        return ((val1 == pair.val1) || (val1 != null && val1.equals(pair.val1)))
                && (val2 == pair.val2) || (val2 != null && val2.equals(pair.val2));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + (val1 == null ? 0 : val1.hashCode());
        result = prime * result + (val2 == null ? 0 : val2.hashCode());
        return result;
    }
}
