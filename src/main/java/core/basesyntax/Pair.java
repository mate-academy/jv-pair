package core.basesyntax;

class Pair<T, K> {
    private T firstValue;
    private K secondValue;

    private Pair(T firstValue, K secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <T, K> Pair of(T firstValue, K secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    public T getFirst() {
        return firstValue;
    }

    public K getSecond() {
        return secondValue;
    }

    @Override
    public int hashCode() {
        return firstValue.hashCode() + secondValue.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof Pair) {
            Pair pair = (Pair) object;
            return pair.getFirst().equals(this.firstValue)
                    && pair.getSecond().equals(this.secondValue);
        }
        return false;
    }
}
