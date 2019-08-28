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

    public static <T, V> Pair of(T firstValue, V secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Pair) {
            Pair pairObject = (Pair) obj;
            return (this.getFirst() != null
                    && this.getFirst().equals(pairObject.getFirst())
                    && pairObject.getFirst() != null
                    && pairObject.getFirst().equals(this.getFirst())
                    && this.getSecond() != null
                    && this.getSecond().equals(pairObject.getSecond())
                    && pairObject.getSecond() != null
                    && pairObject.getSecond().equals(this.getSecond()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = (this.getFirst() != null ? this.getFirst().hashCode() : 0)
                + (this.getSecond() != null ? this.getSecond().hashCode() : 0);
        return result;
    }
}

