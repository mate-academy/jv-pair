package core.basesyntax;

class Pair<T, V> {
    private T firstValue;
    private V secondValue;

    private Pair(T firstValue, V secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirst() {
        return firstValue;
    }

    public V getSecond() {
        return secondValue;
    }

    public static <T, V> Pair of(T first, V second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (pair.getClass().equals(Pair.class)) {
            Pair currentPair = (Pair) pair;
            return (firstValue == currentPair.firstValue
                    || (firstValue != null && firstValue.equals(currentPair.firstValue)))
                    && (secondValue == currentPair.secondValue
                    || (secondValue != null && secondValue.equals(currentPair.secondValue)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 29 * result + (firstValue == null ? 0 : firstValue.hashCode());
        result = 17 * result + (secondValue == null ? 0 : secondValue.hashCode());
        return result;
    }
}
