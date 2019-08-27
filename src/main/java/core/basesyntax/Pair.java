package core.basesyntax;

import java.util.Objects;

class Pair<T, V> {
    private T firstValue;
    private V secondValue;

    public T getFirst() {
        return firstValue;
    }

    public V getSecond() {
        return secondValue;
    }

    private Pair(T firstValue, V secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <T, V> Pair<T, V> of(T firstValue, V secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair<T, V> pair = (Pair) obj;
        return Objects.equals(firstValue, pair.firstValue)
                && Objects.equals(secondValue, pair.secondValue);
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (secondValue == null ? 0 : secondValue.hashCode());
        result = prime * result + (firstValue == null ? 0 : firstValue.hashCode());
        return result;
    }
}
