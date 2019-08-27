package core.basesyntax;

import java.util.NoSuchElementException;
import java.util.Objects;

class Pair<T, V> {
    private T firstValue;
    private V secondValue;

    public T getFirst() {
        if (firstValue == null) {
            throw new NoSuchElementException("No value present");
        }
        return firstValue;
    }

    public V getSecond() {
        if (secondValue == null) {
            throw new NoSuchElementException("No value present");
        }
        return secondValue;
    }

    private Pair() {
        this.firstValue = null;
        this.secondValue = null;
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

        Pair<?, ?> other = (Pair<?, ?>) obj;
        return Objects.equals(firstValue, other.firstValue) && Objects.equals(secondValue, other.secondValue);
    }

    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }

}
