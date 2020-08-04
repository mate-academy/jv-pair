package core.basesyntax;

class Pair<T, K> {

    private T firstValue;
    private K secondValue;

    private Pair(T firstValue, K secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <T, K> Pair<T, K> of(T first, K second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return firstValue;
    }

    public K getSecond() {
        return secondValue;
    }

    @Override
    public boolean equals(Object object) {

        if (object == this) {
            return true;
        }

        if (object == null) {
            return false;
        }

        if (object.getClass().equals(Pair.class)) {
            Pair<T, K> pair = (Pair<T, K>) object;
            return firstValue != null ? firstValue.equals(pair.firstValue)
                    : pair.firstValue == null
                    && secondValue != null ? secondValue.equals(pair.secondValue)
                    : pair.secondValue == null;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 71;
        hashCode = 97 * hashCode
                + (firstValue != null ? firstValue.hashCode() : 0);
        hashCode = 97 * hashCode
                + (secondValue != null ? secondValue.hashCode() : 0);
        return hashCode;
    }
}
