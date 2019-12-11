package core.basesyntax;

class Pair<T, V> {
    private T firstElement;
    private V secondElement;

    private Pair(T firstElement, V secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirst() {
        return firstElement;
    }

    public V getSecond() {
        return secondElement;
    }

    public static <T, V> Pair of(T firstElement, V secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass() != Pair.class) {
            return false;
        }
        Pair pairObject = (Pair) object;
        return this.firstElement.equals(pairObject.firstElement)
                && this.secondElement.equals(pairObject.secondElement);
    }

    @Override
    public int hashCode() {
        int result = (firstElement != null ? firstElement.hashCode() : 0)
                + (secondElement != null ? secondElement.hashCode() : 0);

        return 31 * result;
    }
}
