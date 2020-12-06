package core.basesyntax;

import java.util.Objects;

class Pair<T, K> {
    private final T firstValue;
    private final K secondValue;

    private Pair(T firstValue, K secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <T, K> Pair<T, K> of(T key, K value) {
        return new Pair<>(key, value);
    }

    public T getFirst() {
        return firstValue;
    }

    public K getSecond() {
        return secondValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object.getClass().equals(Pair.class))) {
            return false;
        }
        Pair<T, K> pair = (Pair<T, K>) object;
        return Objects.equals(firstValue, pair.firstValue)
                && Objects.equals(secondValue, pair.secondValue);
    }

    @Override
    public int hashCode() {
        return 31 * (31 * 17 + (firstValue == null ? 0 : firstValue.hashCode()))
                + (secondValue == null ? 0 : secondValue.hashCode());
    }
}
