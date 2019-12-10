package core.basesyntax;

class Pair<T, K> {

    private T value;
    private K value2;

    private Pair(T value, K value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getFirst() {
        return value;
    }

    public K getSecond() {
        return value2;
    }

    public static <T, K> Pair of(T value, K value2) {
        return new Pair<>(value, value2);
    }

    @Override
    public boolean equals(Object objToCompare) {
        if (this == objToCompare) {
            return true;
        }
        if (objToCompare.getClass() != Pair.class
                || objToCompare == null) {
            return false;
        }
        Pair pair = (Pair) objToCompare;
        return this.value.equals(pair.value)
                && this.value2.equals(pair.value2);
    }

    @Override
    public int hashCode() {
        return ((value != null) ? value.hashCode() : 0) * 31
                + ((value2 != null) ? value2.hashCode() : 0) * 31;
    }
}
