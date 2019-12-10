package core.basesyntax;

class Pair<T, K> {

    private T key;
    private K value;

    private Pair(T key, K value) {
        this.key = key;
        this.value = value;
    }

    public T getFirst() {
        return key;
    }

    public K getSecond() {
        return value;
    }

    public static <T, K> Pair of(T key, K value) {
        return new Pair<>(key, value);
    }

    @Override
    public boolean equals(Object objToCompare) {
        if (this == objToCompare) {
            return true;
        }
        if (objToCompare == null
                || objToCompare.getClass() != this.getClass()) {
            return false;
        }
        Pair pair = (Pair) objToCompare;
        return this.key.equals(pair.key)
                && this.value.equals(pair.value);
    }

    @Override
    public int hashCode() {
        return ((key != null) ? key.hashCode() : 0) * 31
                + ((value != null) ? value.hashCode() : 0) * 31;
    }
}
