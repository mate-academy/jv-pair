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

    public static <T, V> Pair<T, V> of(T t, V v) {
        return new Pair<>(t, v);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (firstElement == null ? 0 : firstElement.hashCode());
        result = 31 * result + (secondElement == null ? 0 : secondElement.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            Pair curr = (Pair<T,V>) obj;
            return ((firstElement == curr.firstElement)
                    || (firstElement != null && firstElement.equals(curr.firstElement)))
                    && ((secondElement == curr.secondElement)
                    || (secondElement != null && secondElement.equals(curr.secondElement)));
        }
        return false;
    }
}
