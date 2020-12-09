package core.basesyntax;

class Pair<K, V> {
    private K firstValue;
    private V secondValue;

    private Pair(K firstValue, V secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <K, V> Pair<K, V> of(K firstValue, V secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    public K getFirst() {
        return firstValue;
    }

    public V getSecond() {
        return secondValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<K, V> pair = (Pair<K, V>) o;
        return (firstValue == pair.firstValue
                || firstValue != null && firstValue.equals(pair.firstValue))
                && (secondValue == pair.secondValue
                || secondValue != null && secondValue.equals(pair.secondValue));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (firstValue == null ? 0 : firstValue.hashCode());
        result = 31 * result + (secondValue == null ? 0 : secondValue.hashCode());
        return result;
    }
}
