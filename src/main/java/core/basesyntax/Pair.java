package core.basesyntax;

import java.util.Objects;

class Pair<T, V> {
    private T first;
    private V second;

    private Pair(T firstPair, V secondPair) {
        this.firstPair = firstPair;
        this.secondPair = secondPair;
    }

    public T getFirst() {
        return firstPair;
    }

    public void setFirst(T firstPair) {
        this.firstPair = firstPair;
    }

    public V getSecond() {
        return secondPair;
    }

    public void setSecond(V secondPair) {
        this.secondPair = secondPair;
    }

    public static <T, V> Pair<T, V> of(T firstPair, V secondPair) {
        return new Pair<>(firstPair, secondPair);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) object;

        if (!Objects.equals(firstPair, pair.firstPair)) {
            return false;
        }
        return Objects.equals(secondPair, pair.secondPair);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (firstPair == null ? 0 : firstPair.hashCode());
        result = 31 * result + (secondPair == null ? 0 : secondPair.hashCode());
        return result;
    }
}
